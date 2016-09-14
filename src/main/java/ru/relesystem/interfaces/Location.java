package ru.relesystem.interfaces;

import ru.relesystem.entities.Relay;

public interface Location {
	void addRelay(Integer numberShelve, Integer relayPosition, Relay currentRelay);
	void deleteRelay(Integer numberShelve, Integer relayPosition);
}
