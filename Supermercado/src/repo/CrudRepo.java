package repo;

import java.util.List;

public interface CrudRepo<T, ID> {
	public T create(T novo);
	public List<T> findAll();
	public T findById(ID id);	
}
