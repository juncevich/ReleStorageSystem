package interfaces;


import entities.Relay;



public interface Location {
    void addRelay(int numberShelve, int relayPosition, Relay currentRelay);
    void deleteRelay(int numberShelve, int relayPosition);
}
