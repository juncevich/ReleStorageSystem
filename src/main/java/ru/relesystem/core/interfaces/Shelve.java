package ru.relesystem.core.interfaces;

import ru.relesystem.core.entities.Relay;

public interface Shelve {
    void addRelay(int index, Relay relay);

    void deleteRelay(int index);
}
