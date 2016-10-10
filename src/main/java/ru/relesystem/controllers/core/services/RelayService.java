package ru.relesystem.core.services;

import java.util.List;

import ru.relesystem.core.entities.Relay;

public interface RelayService {
	List<Relay> findAll();
	List<Relay> findAllWithDetail();
	Relay findById(Long id);
	Relay save(Relay relay);
	void delete(Relay relay);
	// List<Relay> findAllByNativeQuery();
}
