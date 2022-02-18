package gen.dao.jdbc;

import java.util.List;

public interface DAO <T> {

	public abstract T get(long id);
	public abstract void save(T t);
	public abstract T update(long id,T T); 
	public abstract void delete(T T);
	public abstract void delete(long id);
	public abstract List<T> getAll();
	
}
