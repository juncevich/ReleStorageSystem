package ru.relesystem.core.dao;

import java.util.List;

import ru.relesystem.core.entities.Relay;
import ru.relesystem.core.entities.location.Location;
import ru.relesystem.core.entities.storage.Storage;

public interface LocationDao {

	List<? extends Location> findAll();
	<T extends Location> T findLocationByName(String locationName);
	List<Relay> findRelayByLocationName(String locationName);
    List<? extends Storage> findStoragesByLocationName(String locationName);
    <T extends Location> T addLocation(Location location);
    <T extends Location> T updateLocation(Location location);
    void deleteLocation(Location location);
}
