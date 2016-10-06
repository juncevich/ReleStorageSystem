package ru.relesystem.core.dao;

import java.util.List;

import ru.relesystem.core.entities.relaytype.RelayType;

public interface RelayTypeDao {

	List<RelayType> findAll();
	RelayType findById(Long id);
	RelayType findByName(String name);
	RelayType updateType(RelayType relayType);
	void deleteType(RelayType relayType);
}
