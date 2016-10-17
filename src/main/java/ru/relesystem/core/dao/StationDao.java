package ru.relesystem.core.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ru.relesystem.core.entities.Relay;
import ru.relesystem.core.entities.location.Location;
import ru.relesystem.core.entities.location.Station;
import ru.relesystem.core.entities.storage.Storage;

@Repository("stationDao")
@Transactional
public class StationDao implements LocationDao {
	@PersistenceContext
	private EntityManager entityManager;
	private Log log = LogFactory.getLog(Station.class);
	@Override
	public List<Station> findAll() {

		return entityManager.createNamedQuery("Station.findAll", Station.class).getResultList();
	}

	@Override
	public Station findLocationByName(String locationName) {
		TypedQuery<Station> query = entityManager.createNamedQuery("Station.findByName", Station.class);
		query.setParameter("stationName", locationName);
		return query.getSingleResult();

	}

	@Override
	public List<Relay> findRelayByLocationName(String locationName) {
		List<Relay> relayList = entityManager.createNamedQuery("Station.findReleayByStationName", Relay.class)
				.setParameter("stationName", locationName).getResultList();
		return relayList;
	}

	@Override
	public List<Storage> findStoragesByLocationName(String locationName) {

		List<Storage> storageList = entityManager.createNamedQuery("Station.findStoragesByStationName", Storage.class)
				.setParameter("stationName", locationName).getResultList();
		return storageList;
	}

	@Override
	public Station addLocation(Location location) {
		Station station = (Station) location;
		log.info("Add station : " + station.getStationName());
		entityManager.persist(station);
		return station;
	}

	@Override
	public Station updateLocation(Location location) {
		Station station = (Station) location;
		log.info("Update station : " + station.getStationName());
		entityManager.merge(station);
		return station;
	}

	@Override
	public void deleteLocation(Location location) {
		Station station = (Station) location;
		Station deletedStation = entityManager.merge(station);
		log.info("Delete station : " + station.getStationName());
		entityManager.remove(deletedStation);
		log.info("Station with name: " + station.getStationName() + " deleted successfully");
	}
}
