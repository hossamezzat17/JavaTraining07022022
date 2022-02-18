package doa.jdbc.control;

import java.util.List;

import doa.jdbc.model.Customer;

/**
 *
 */
public interface CustomerDAO {
	public abstract void save(Customer customer);
	public abstract Customer get(long id);
	public abstract Customer update(long id,Customer customer); 
	public abstract void delete(Customer customer);
	public abstract void delete(long id);
	public abstract List<Customer> getAll();
}
