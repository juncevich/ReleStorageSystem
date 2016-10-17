package ru.relesystem.core.dao;

import java.util.List;

import ru.relesystem.core.entities.Relay;
import ru.relesystem.core.entities.location.Location;
import ru.relesystem.core.entities.storage.Storage;

public interface LocationDao {

	List<Location> findAll();
	Location findStorageByName(String storageName);
	List<Relay> findReleayByStorageName();
    List<Storage> findStoragesByLocationName();

}
