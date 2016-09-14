package ru.relesystem.location;

import java.util.HashMap;

import ru.relesystem.entities.Relay;

/**
 *
 */
public class Station {
	private HashMap<Integer, Stativ> stationStorage;

	public void addRelay(int numberStativ, int numberShelve, int relayPosition, Relay currentRelay) {
		stationStorage.get(numberStativ).addRelay(numberShelve, relayPosition, currentRelay);
	}

	public void deleteRelay(int numberStativ, int numberShelve, int relayPosition) {
		stationStorage.get(numberStativ).deleteRelay(numberShelve, relayPosition);
	}
}
