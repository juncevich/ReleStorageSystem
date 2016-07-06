package ru.relesystem.interfaces;


import ru.relesystem.entities.Relay;



public interface Location {
    void addRelay(int numberShelve, int relayPosition, Relay currentRelay);
    void deleteRelay(int numberShelve, int relayPosition);
}
