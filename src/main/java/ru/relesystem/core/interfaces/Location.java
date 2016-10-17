package ru.relesystem.core.interfaces;

import ru.relesystem.core.entities.Relay;

public interface Location {
    void addRelay(Integer numberShelve, Integer relayPosition, Relay currentRelay);
    
    void deleteRelay(Integer numberShelve, Integer relayPosition);
}
