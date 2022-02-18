package doa.jdbc.control;

import doa.jdbc.model.Customer;

public class Application {

	private static CustomerDAO customerDAO;
	
	public static void main(String[] args) {
//		customerDAO = new DerbyCustomerDAOImpl();
//		customerDAO = new MapCustomerDAOImpl();
		customerDAO = new ArrayListCustomerDAOImpl();
		
		Customer c01 = new Customer("Max","Mustermann",1975);
		
		customerDAO.save(c01);
		
		Customer c02 = customerDAO.get(1);
		
		System.out.println(c01);
		System.out.println(c02);
	}
}
