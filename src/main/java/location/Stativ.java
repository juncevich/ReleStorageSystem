package location;


import entities.Relay;
import interfaces.Location;
import interfaces.Shelve;

public class Stativ implements Location{

    private int number;
    private Shelve[] stativStorage = new Shelve[18];

    public Stativ(int number) {
        this.number = number;
    }

    public void addRelay(int numberShelve, int relayPosition, Relay currentRelay) {
        stativStorage[numberShelve].addRelay(relayPosition, currentRelay);
    }

    public void deleteRelay(int numberShelve, int relayPosition) {
        stativStorage[numberShelve].deleteRelay(relayPosition);
    }


}
