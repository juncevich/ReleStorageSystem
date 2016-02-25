package location;


import entities.Relay;
import interfaces.Shelve;

/**
 * Statives and relay boards have a shelves.
 * Relays are in a shelve.
 * Standart shelve capasity is eight.
 */
public class StandartShelve implements Shelve {
    /**
     * One shelve may have maximum eight relays.
     */
    Relay[] shelveStorage = new Relay[8];

    /**
     * Add relay to the shelve by index.
     * @param index  index of order location relays
     *               on th shelve
     * @param relay  relay, that need add to shelve
     */
    public void addRelay(int index, Relay relay) {
        shelveStorage[index] = relay;
    }

    /**
     * Delete relay from shelve by concrete index.
     * @param index  index of order location relays
     *               on th shelve
     */
    public void deleteRelay(int index) {
        shelveStorage[index] = null;
    }

}
