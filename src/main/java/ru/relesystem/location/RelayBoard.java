package ru.relesystem.location;

import ru.relesystem.entities.Relay;
import ru.relesystem.interfaces.Location;
import ru.relesystem.interfaces.Shelve;

/**
 * Relay board may can be at any railway crossing,
 * any railway point and any station. It has six shelves.
 * Each shelve has maximum eight connectors to connect the relay.
 */
public class RelayBoard implements Location {
    Shelve[] relayBoardStorage = new Shelve[5];

    public void addRelay(int numberShelve, int relayPosition, Relay currentRelay) {
        relayBoardStorage[numberShelve].addRelay(relayPosition, currentRelay);
    }

    public void deleteRelay(int numberShelve, int relayPosition){
        relayBoardStorage[numberShelve].deleteRelay(relayPosition);
    }
}
