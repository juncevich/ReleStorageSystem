package ru.relesystem.core.dao;

import ru.relesystem.core.entities.relaytype.RelayType;

import java.util.List;
public interface RelayTypeDao {

	List<RelayType> findAll();
	RelayType findById(Long id);
	RelayType findByName(String name);
	RelayType addType(RelayType relayType);
	RelayType updateType(RelayType relayType);
	void deleteType(RelayType relayType);
}
