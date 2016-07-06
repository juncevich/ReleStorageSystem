package ru.relesystem.location;

import ru.relesystem.entities.Relay;

import java.util.HashMap;

/**
 *
 */
public class Station {
    HashMap<Integer, Stativ> stationStorage;

    public void addRelay(int numberStativ, int numberShelve, int relayPosition, Relay currentRelay) {
        stationStorage.get(numberStativ).addRelay(numberShelve, relayPosition, currentRelay);
    }

    public void deleteRelay(int numberStativ, int numberShelve, int relayPosition) {
        stationStorage.get(numberStativ).deleteRelay(numberShelve,relayPosition);
    }
}
