package ru.relesystem.core.location;

import ru.relesystem.core.entities.Relay;

import java.util.HashMap;

/**
 *
 */
public class RailwayCrossing {
    private HashMap<Integer, RelayBoard> boards;

    public void addRelay(int boardNumber, int numberShelve, int relayPosition, Relay currentRelay) {
        boards.get(boardNumber).addRelay(numberShelve, relayPosition, currentRelay);
    }

    public void deleteRelay(int boardNumber, int numberShelve, int relayPosition) {
        boards.get(boardNumber).deleteRelay(numberShelve, relayPosition);
    }
}
