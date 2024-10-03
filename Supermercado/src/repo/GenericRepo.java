package repo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class GenericRepo<T,ID> implements CrudRepo<T, ID>{

	private List<T> database;
	
	public GenericRepo() {
		this.database = new ArrayList<T>();
	}
	@Override
	public T create(T novo) {
		// TODO Auto-generated method stub
		this.database.add(novo);
		return novo;
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return this.database;
	}

	@Override
	public T findById(ID id) {
		// TODO Auto-generated method stub
		return this.database.stream().filter( entity -> isEqual(entity, id)).findFirst().orElse(null);
	}
	
	private boolean isEqual(T entity, ID id) {
		try {
			for (Field f: entity.getClass().getDeclaredFields()) {
				for (Annotation an: f.getAnnotations()) {
					if (an.annotationType().getName().equals("repo.Chave")) {
						f.setAccessible(true);
						return f.get(entity).equals(id);
					}
				}				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
		return false;
	}

}
