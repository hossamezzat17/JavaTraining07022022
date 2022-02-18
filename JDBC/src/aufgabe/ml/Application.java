package aufgabe.ml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.jdbc.control.utilities.DerbyUtilities;

public class Application {

	public static void main(String[] args) {
		/**
		 * Erzeugen Sie einige Objekte der Klassen Customer und Product.
		 */
		Customer c01 = new Customer("Esma", "Wetterwachs", 1975);
		Customer c02 = new Customer("Max", "Mustermann", 1975);
		Customer c03 = new Customer("Windle", "Poons", 1975);
		Customer c04 = new Customer("Tiffany", "Weh", 1975);

		Product p01 = new Product("Hilfe", "Das hilfreiche", 12.3, false);
		Product p02 = new Product("Produkt 02", "etwas anderes", 2.23, false);
		Product p03 = new Product("Produkt 03", "noch einmal anders", 323.4, false);
		Product p04 = new Product("Produkt 04", "Wichtig", 423.45, false);

		/**
		 * Nutzen die DerbyDB um 2 Tabellen anzulegen.
		 * 
		 * Eine Tabelle Customer und eine Tabelle Product.
		 * 
		 */

		String url = "jdbc:derby:memory:aufgabe_jdbc;create=true";

		try {
			/**
			 * Verbindung ist hergestellt
			 */
			Connection con = DriverManager.getConnection(url);
			System.out.println("Verbindung hergestellt");

			/**
			 * Erzeugen der Tabelle Customer
			 */
			try (Statement stm = con.createStatement()) {
				String sql = "CREATE TABLE customer ("
						+ "id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
						+ "firstname VARCHAR(45)," + "lastname VARCHAR(45)," + "yearofbirth int,"
						+ "CONSTRAINT ck_id PRIMARY KEY (id)  )";

				stm.executeUpdate(sql);

				System.out.println("Tabelle Customer wurde erzeugt");

			} catch (SQLException e) {
				System.out.println("Tabelle Customer fehlgeschlagen");
			}

			/**
			 * Erzeugen der Tabelle Product
			 */
			try (Statement stm = con.createStatement()) {
				/**
				 * Achtung die Constraints dürfen keine doppelten einträge beinhalten.
				 * 
				 * ck_id für customerKey_id
				 * 
				 * pk_id für productKey_id
				 */
				String sql = "CREATE TABLE product ("
						+ "id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
						+ "name VARCHAR(45)," + "description VARCHAR(45)," + "price double," + "food boolean,"
						+ "CONSTRAINT pk_id PRIMARY KEY (id)  )";

				stm.executeUpdate(sql);

				System.out.println("Tabelle Product wurde erzeugt");

			} catch (SQLException e) {
				System.out.println("Tabelle Product fehlgeschlagen");
			}

			/**
			 * Schreiben von Datensätzen in die Tabelle
			 */
			String prepSql = "INSERT INTO customer (firstname,lastname,yearofbirth) VALUES (?,?,?)";

			try (PreparedStatement stm = con.prepareStatement(prepSql)) {

				for (Customer customer : List.of(c01, c02, c03, c04)) {
					stm.setString(1, customer.getFirstname());
					stm.setString(2, customer.getLastname());
					stm.setInt(3, customer.getYearOfBirth());
					stm.executeUpdate();
				}
				System.out.println("Customer geschrieben");
			} catch (SQLException e) {
				System.out.println("Schreiben von Customer fehlgeschlagen");
			}

			prepSql = "INSERT INTO product (name,description,price,food) VALUES (?,?,?,?)";

			try (PreparedStatement stm = con.prepareStatement(prepSql)) {

				for (Product product : List.of(p01, p02, p03, p04)) {
					stm.setString(1, product.getName());
					stm.setString(2, product.getDescription());
					stm.setDouble(3, product.getPrice());
					stm.setBoolean(4, product.isFood());
					stm.executeUpdate();
				}

				System.out.println("Product geschrieben");
			} catch (SQLException e) {
				System.out.println("Schreiben von product fehlgeschlagen");
			}

			/**
			 * Lesen der Daten Customer
			 */
			try (Statement stm = con.createStatement()) {
				String sql = "SELECT * FROM customer";
				stm.execute(sql);
				try (ResultSet result = stm.getResultSet()) {
					DerbyUtilities.showResultSet(result);
				}

			} catch (SQLException e) {
				System.out.println("Lesen von customer fehlgeschlagen");
			}
			System.out.println("--------------------------------");
			/**
			 * Lesen der Daten Product
			 */
			try (Statement stm = con.createStatement()) {
				String sql = "SELECT * FROM Product";
				stm.execute(sql);
				try (ResultSet result = stm.getResultSet()) {
					DerbyUtilities.showResultSet(result);
				}

			} catch (SQLException e) {
				System.out.println("Lesen von Product fehlgeschlagen");
			}

		} catch (SQLException e) {
			System.out.println("Verbindung fehlgeschlagen");
		}

	}

}
