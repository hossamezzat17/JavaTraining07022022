package doa.jdbc.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import doa.jdbc.model.Customer;

public class MapCustomerDAOImpl implements CustomerDAO{

	private Map<Long,Customer> mapOfcustomer;
	private long id =1;
	
	public MapCustomerDAOImpl() {
		mapOfcustomer = new HashMap<Long, Customer>();
		System.out.println("Map DATABASE erzeugt");
	}
	
	@Override
	public void save(Customer customer) {
		mapOfcustomer.put(id++, customer);
		System.out.println("Eintrag geschrieben");
	}

	@Override
	public Customer get(long id) {
		return mapOfcustomer.get(id);
	}

	@Override
	public Customer update(long id, Customer customer) {
		return mapOfcustomer.replace(id, customer);
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
