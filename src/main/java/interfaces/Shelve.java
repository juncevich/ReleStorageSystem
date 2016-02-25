package interfaces;


import entities.Relay;

public interface Shelve {
    void addRelay(int index, Relay relay);
    void deleteRelay(int index);
}
