package ru.relesystem.core.location;

import java.util.HashMap;

import ru.relesystem.core.entities.Relay;

/**
 *
 */
public class RailwayPoint {
	private HashMap<Integer, RelayBoard> railwayPointStorage;
	public void addRelay(int relayBoardNumber, int numberShelve, int relayPosition, Relay currentRelay) {
		railwayPointStorage.get(relayBoardNumber).addRelay(numberShelve, relayPosition, currentRelay);
	}

	public void deleteRelay(int relayBoardNumber, int numberShelve, int relayPosition) {
		railwayPointStorage.get(relayBoardNumber).deleteRelay(numberShelve, relayPosition);
	}
}
