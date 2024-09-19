package org.FootballApp.utility;

import java.util.List;
import java.util.Optional;

public interface ICRUD<T> {
	Optional<T> save(T t);
	List<T> saveAll(List<T> t);
	Optional<T> update(T t);
	Optional<List<T>> findAll();
	Optional<T> findByID(int id);
}