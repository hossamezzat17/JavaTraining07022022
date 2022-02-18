package doa.jdbc.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import doa.jdbc.model.Customer;

public class DerbyCustomerDAOImpl implements CustomerDAO {
	
	private Connection con;
	
	public DerbyCustomerDAOImpl() {
		this.con = DerbyConnection.getInstance().getConnection();
	}
	
	@Override
	public void save(Customer customer) {
		String prepSql = "INSERT INTO customer (firstname,lastname,yearofbirth) VALUES(?,?,?)";

		try(PreparedStatement prep = con.prepareStatement(prepSql)){
			prep.setString(1, customer.getFirstname());
			prep.setString(2, customer.getLastname());
			prep.setInt(3, customer.getYearOfBirth());
			prep.executeUpdate();
			System.out.println(customer + " In die DB geschrieben");
		} catch (SQLException e) {
			System.out.println("Fehler beim Schreiben :" + e.getSQLState()) ;
		}
		
	}

	@Override
	public Customer get(long id) {
		Customer customer = new Customer();
		try(Statement stm = con.createStatement()){
			String SQL = "SELECT * FROM customer WHERE id =" +id;
			stm.execute(SQL);
			try(ResultSet result = stm.getResultSet()){
				if(result.next()) {
					customer.setFirstname(result.getString(2));
					customer.setLastname(result.getString(3));
					customer.setYearOfBirth(result.getInt(4));
				}
			}
		} catch (SQLException e) {
			System.out.println("Fehler beim Lesen :" + e.getSQLState()) ;
		}
		return customer;
	}

	@Override
	public Customer update(long id, Customer customer) {
		throw new UnsupportedOperationException("not implemented yet");
		//return null;
	}

	@Override
	public void delete(Customer customer) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public void delete(long id) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public List<Customer> getAll() {
		throw new UnsupportedOperationException("not implemented yet");
//		return null;
	}

}
