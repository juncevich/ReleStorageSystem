package ru.relesystem.core.services;

import java.util.List;

import ru.relesystem.core.entities.relaytype.RelayType;

public interface RelayTypeService {
	List<RelayType> findAll();
	RelayType findById(Long id);
	RelayType findByName(String name);
	RelayType updateType(RelayType relayType);
	void deleteType(RelayType relayType);
}
