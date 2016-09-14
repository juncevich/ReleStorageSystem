package ru.relesystem.location;

import ru.relesystem.entities.Relay;
import ru.relesystem.interfaces.Location;
import ru.relesystem.interfaces.Shelve;

public class Stativ implements Location {

	private Integer number;
	private Shelve[] stativStorage = new Shelve[18];

	public Stativ(Integer number) {
		this.number = number;
	}

	public void addRelay(Integer numberShelve, Integer relayPosition, Relay currentRelay) {
		stativStorage[numberShelve].addRelay(relayPosition, currentRelay);
	}

	public void deleteRelay(Integer numberShelve, Integer relayPosition) {
		stativStorage[numberShelve].deleteRelay(relayPosition);
	}

}
