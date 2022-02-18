package doa.jdbc.control;

import java.util.List;
import java.util.Set;

import doa.jdbc.model.Customer;

public class TreeSetCustomerDAOImpl implements CustomerDAO {

	private Set<Customer> setOfCustomer;
	
	@Override
	public void save(Customer customer) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public Customer get(long id) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public Customer update(long id, Customer customer) {
		throw new UnsupportedOperationException("not implemented yet");
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
	}

}
