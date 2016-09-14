package ru.relesystem.interfaces;

import ru.relesystem.entities.Relay;

public interface Shelve {
	void addRelay(int index, Relay relay);
	void deleteRelay(int index);
}
