package ru.relesystem.core.entities.location;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ru.relesystem.core.entities.Relay;
import ru.relesystem.core.entities.storage.Stativ;

@Entity
@Table(name = "STATION")
@NamedQueries({@NamedQuery(name = "Station.findById", query = "select s from Station s where s.id = :id"),
		@NamedQuery(name = "Station.findAllWithDetail", query = "select s from Station s "),})
public class Station extends Location {

	/**
	 * Название станции
	 */
	private String stationName;

	/**
	 * Список стативов на станции
	 */
	private List<Stativ> storageList = new ArrayList<>();

	/**
	 *
	 */
	private List<Relay> relayList = new ArrayList<>();
	public Station() {

	}

	public void addStativ(Stativ stativ) {

		stativ.setStation(this);
		getStorageList().add(stativ);
	}

	public void removeStativ(Stativ stativ) {

		getStorageList().remove(stativ);
	}

	@Override
	public String toString() {

		return "Station{" + "stationName='" + stationName + '\'' + '}';
	}

	public void addRelay(Relay relay) {
		relay.setStation(this);
		relayList.add(relay);
	}

	public void removeRelay(Relay relay) {
		getRelayList().remove(relay);
	}

	/**
	 * @return the {@link #relayList}
	 */
	@OneToMany(mappedBy = "station")
	public List<Relay> getRelayList() {

		return relayList;
	}

	@OneToMany(mappedBy = "station")
	public List<Stativ> getStorageList() {

		return storageList;
	}

	@Column(name = "STATION_NAME")
	public String getStationName() {

		return stationName;
	}

	/**
	 * @param relayList
	 *            the {@link #relayList} to set
	 */
	public void setRelayList(List<Relay> relayList) {

		this.relayList = relayList;
	}

	public void setStorageList(List<Stativ> storageList) {

		this.storageList = storageList;
	}

	public void setStationName(String stationName) {

		this.stationName = stationName;
	}
}
