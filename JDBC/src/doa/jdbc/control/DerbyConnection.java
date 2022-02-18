package doa.jdbc.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DerbyConnection {

	private static final DerbyConnection INSTANCE = new DerbyConnection();

	private String url;
	private Connection con;

	public static DerbyConnection getInstance() {
		return INSTANCE;
	}

	private String getUrl() {
		return url;
	}

	private void setUrl(String url) {
		this.url = url;
	}

	public Connection getConnection() {
		return con;
	}

	private void setCon(Connection con) {
		this.con = con;
	}

	private DerbyConnection() {
		this.createConnection();
		this.createCustomerTable();
	}
	
	private void createConnection() {
		this.setUrl("jdbc:derby:memory:MyDerby;create=true");
		try {
			this.setCon(DriverManager.getConnection(this.getUrl()));
		} catch (SQLException e) {
			System.out.println("Verbindung fehlgeschlagen");
		}
	}

	private void createCustomerTable() {
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
	}

}
