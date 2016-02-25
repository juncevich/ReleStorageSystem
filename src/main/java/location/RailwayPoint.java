package location;

import entities.Relay;

import java.util.HashMap;



public class RailwayPoint {
    HashMap<Integer, RelayBoard> railwayPointStorage;
    public void addRelay(int relayBoardNumber, int numberShelve, int relayPosition, Relay currentRelay) {
        railwayPointStorage.get(relayBoardNumber).addRelay(numberShelve, relayPosition, currentRelay);
    }

    public void deleteRelay(int relayBoardNumber, int numberShelve, int relayPosition) {
        railwayPointStorage.get(relayBoardNumber).deleteRelay(numberShelve, relayPosition);
    }
}
