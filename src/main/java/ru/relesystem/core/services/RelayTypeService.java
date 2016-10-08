package ru.relesystem.core.services;

import ru.relesystem.core.entities.relaytype.RelayType;

import java.util.List;

public interface RelayTypeService {
	List<RelayType> findAll();
	RelayType findById(Long id);
	RelayType findByName(String name);

	RelayType addType(RelayType relayType);
	RelayType updateType(RelayType relayType);
	void deleteType(RelayType relayType);
}
