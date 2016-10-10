package ru.relesystem.core.location;

import ru.relesystem.core.entities.Relay;
import ru.relesystem.core.interfaces.Location;
import ru.relesystem.core.interfaces.Shelve;

/**
 * Relay board may can be at any railway crossing, any railway point and any
 * station. It has six shelves. Each shelve has maximum eight connectors to
 * connect the relay.
 */
public class RelayBoard implements Location {
	private Shelve[] relayBoardStorage = new Shelve[5];

	public void addRelay(Integer numberShelve, Integer relayPosition, Relay currentRelay) {
		relayBoardStorage[numberShelve].addRelay(relayPosition, currentRelay);
	}

	public void deleteRelay(Integer numberShelve, Integer relayPosition) {
		relayBoardStorage[numberShelve].deleteRelay(relayPosition);
	}
}
