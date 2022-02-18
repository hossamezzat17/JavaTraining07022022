package org.jdbc.control;

import java.sql.Connection;
import java.sql.SQLException;

import org.jdbc.control.utilities.DerbyUtilities;

public class Demo02ApacheDerbySQLExcption {

	public static void main(String[] args) {

		try (Connection con = DerbyUtilities.getConnectionIMDB()) {

			try {
				DerbyUtilities.createTestTable(con,"test01");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				DerbyUtilities.createTestTable(con,"test02");
			} catch (SQLException e) {
//				e.printStackTrace();
				System.out.println(e.getSQLState());
				System.out.println(e.getMessage());
			}
			
		} catch (SQLException e) {

		}
	}

}
