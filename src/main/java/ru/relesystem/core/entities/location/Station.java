package ru.relesystem.core.entities.location;

import ru.relesystem.core.entities.Relay;
import ru.relesystem.core.entities.storage.Stativ;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "STATIONS")
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

	/**
	 * @param relayList
	 *            the {@link #relayList} to set
	 */
	public void setRelayList(List<Relay> relayList) {

		this.relayList = relayList;
	}

	@OneToMany(mappedBy = "station")
	public List<Stativ> getStorageList() {

		return storageList;
	}

	public void setStorageList(List<Stativ> storageList) {

		this.storageList = storageList;
	}

	@Column(name = "STATION_NAME")
	public String getStationName() {

		return stationName;
	}

	public void setStationName(String stationName) {

		this.stationName = stationName;
	}
}
