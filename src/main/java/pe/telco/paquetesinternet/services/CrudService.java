package pe.telco.paquetesinternet.services;

import java.util.List;
import java.util.Optional;

public interface CrudService<T> {
	List<T> findAll() throws Exception;

	T save(T t) throws Exception;

	T update(T t) throws Exception;

	void deleteById(String id) throws Exception;

	Optional<T> findById(String id) throws Exception;

	boolean existsById(String id) throws Exception;
}
