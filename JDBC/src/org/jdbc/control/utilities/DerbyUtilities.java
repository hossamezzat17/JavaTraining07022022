package org.jdbc.control.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DerbyUtilities {

	public static Connection getConnectionIMDB() throws SQLException {
		String url = "jdbc:derby:memory:myderby;create=true";
		return DriverManager.getConnection(url);
	}

	public static void createTestTable(Connection con, String tableName) throws SQLException {

		try (Statement stm = con.createStatement()) {
			String sql = "CREATE TABLE " + tableName +  " ("
					+ "id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
					+ "lastname VARCHAR(45)," + "firstname VARCHAR(45)," + "yearofbirth int,"
					+ "CONSTRAINT " + tableName +  "_id PRIMARY KEY (id)  )";
			stm.execute(sql);
			System.out.println("Test " + tableName + " erstellt");
		}

	}
	
	public static void showResultSet(ResultSet result) throws SQLException{
		/**
		 * Metadaten des Resultset abfragen.
		 */
		ResultSetMetaData rsmd = result.getMetaData();
		for(int i=1;i<=rsmd.getColumnCount();i++) {
			System.out.printf("%15s |",rsmd.getColumnLabel(i));
		}
		System.out.println();
		/**
		 * Lesen der Tupel/Datensatz aus der Tabelle
		 */
		while(result.next()) {
			for(int i=1;i<=rsmd.getColumnCount();i++) {
				System.out.printf("%15s |", result.getString(i));	
			}
			System.out.println();
		}
	}

}
