package org.jdbc.control;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.jdbc.model.Person;

public class Demo01ApacheDerbyAccess {

	public static void main(String[] args) {
		// "jdbc:Datenbanksystem:memory:name_der_datenbank;create=true"

		String url = "jdbc:derby:memory:derby_db_inmemory;create=true";

		try {
			/**
			 * Verbindung ist hergestellt
			 */
			Connection con = DriverManager.getConnection(url);
			System.out.println("Verbindung hergestellt");

			/**
			 * Erzeugen einer Tabelle in der Datenbank
			 */
			try (Statement stm = con.createStatement()) {
				String sql = "CREATE TABLE personen ("
						+ "id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
						+ "lastname VARCHAR(45),"
						+ "firstname VARCHAR(45),"
						+ "geburtsjahr int,"
						+ "CONSTRAINT pk_id PRIMARY KEY (id)  )";
				
				stm.executeUpdate(sql);
				
				System.out.println("Tabelle wurde erzeugt");
				
			} catch (SQLException e) {
				System.out.println("Tabellen Statement fehlgeschlagen");
			}
			
			/**
			 * Schreiben von Datensätzen in die Tabelle
			 * 
			 * INSERT INTO Statement - unpraktikabel
			 */
			try(Statement stm = con.createStatement()){
				String sql = "INSERT INTO personen (lastname,firstname,geburtsjahr) VALUES"
						+ " ('Musterfrau','Maria',1956)";
				stm.executeUpdate(sql);
				System.out.println("Eintrag wurde erstellt");
			} catch (SQLException e) {
				System.out.println("Datensatz Statement fehlgeschlagen");
			}
			
			/**
			 * Schreiben von Datensätzen in die Tabelle
			 * 
			 * INSERT INTO PreparedStatement - besser steuerbar
			 */
			String prepSql = "INSERT INTO personen (lastname,firstname,geburtsjahr) VALUES (?,?,?)";
			
			try(PreparedStatement stm = con.prepareStatement(prepSql)){
				
				stm.setString(1, "Andersen");//Andersen
				stm.setString(2, "Hans Christian");
				stm.setInt(3, 1805);
				
				stm.executeUpdate();//Ohne diesen Aufruf, wird das SQL nicht an der Datenbank ausgeführt
				
				stm.setString(1, "Mustermann");//Mustermann
				stm.setString(2, "Max");
				stm.setInt(3, 1965);
				stm.executeUpdate();//Ohne diesen Aufruf, wird das SQL nicht an der Datenbank ausgeführt
				
				stm.setString(1, "Feuerstein");//Feuerstein
				stm.setString(2, "Fred");
				stm.setInt(3, 1945);
				stm.executeUpdate();//Ohne diesen Aufruf, wird das SQL nicht an der Datenbank ausgeführt
				
				stm.setInt(3, 1989);//Feuerstein - Fred
				stm.executeUpdate();//Ohne diesen Aufruf, wird das SQL nicht an der Datenbank ausgeführt
				
				/**
				 * Ein Objekt der Klasse Person in die Datenbank Übertragen
				 */
				Person p = new Person("JDBC", "APACHE DERBY", 2022);
				
				stm.setString(1, p.getLastname());
				stm.setString(2, p.getFirstname());
				stm.setInt(3, p.getYearOfBirth());
				stm.executeUpdate();
				
				System.out.println("Einträge wurden erstellt");
			} catch (SQLException e) {
				System.out.println("Datensatz PreparedStatement fehlgeschlagen");
			}
			
			/**
			 * Ab hier beginnt das Lesen der Daten
			 */
			try(Statement stm = con.createStatement()) {
				String sql = "SELECT * FROM personen";
				
				try(ResultSet result = stm.executeQuery(sql)){
					ResultSetMetaData rsmd = result.getMetaData();
					System.out.printf("%3s | %12s | %-18s | %5s %n", rsmd.getColumnName(1),rsmd.getColumnName(2)
								,rsmd.getColumnName(3),rsmd.getColumnName(4));	
					
					while(result.next()) {
//						System.out.println(result.getString(2) + " | " + result.getString(3) + " | " + result.getInt(4));
						System.out.printf("%03d | %12s | %-18s | %5d %n", result.getInt(1),result.getString(2)
								,result.getString(3),result.getInt(4));
						
						/**
						 * Person aus der Datenbank lesen
						 */
						Person p = new Person(result.getString(2), result.getString(3), result.getInt(4));
						System.out.println(p);
					}
				}
							
			} catch (SQLException e) {
				System.out.println("Fehler beim Lesen der Daten");
			}

		} catch (SQLException e) {
			System.out.println("Verbindung fehlgeschlagen");
		}

	}

}







