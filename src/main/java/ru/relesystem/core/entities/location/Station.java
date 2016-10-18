package ru.relesystem.core.entities.location;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ru.relesystem.core.entities.storage.Stativ;

@Entity
@Table(name = "STATIONS")
@NamedQueries({
		@NamedQuery(name = "Station.findByName", query = "select s from Station s where s.locationName = :stationName "),
		@NamedQuery(name = "Station.findAll", query = "select s from Station s "),
		@NamedQuery(name = "Station.findReleayByStationName", query = "select r from Relay r where r.location.locationName = :stationName"),
		@NamedQuery(name = "Station.findStoragesByStationName", query = "select s from Stativ s where s.location.locationName = :stationName ")})
public class Station extends Location {

	/**
	 * Список стативов на станции
	 */
	private List<Stativ> storageList = new ArrayList<>();


	public Station() {
	
	}

	public void addStativ(Stativ stativ) {

		stativ.setLocation(this);
		getStorageList().add(stativ);
	}

	public void removeStativ(Stativ stativ) {

		getStorageList().remove(stativ);
	}

	@Override
	public String toString() {

		return "Station{" + "stationName='" + getLocationName() + '\'' + '}';
	}

	@OneToMany(mappedBy = "location")
	public List<Stativ> getStorageList() {

		return storageList;
	}

	public void setStorageList(List<Stativ> storageList) {

		this.storageList = storageList;
	}
	
}
