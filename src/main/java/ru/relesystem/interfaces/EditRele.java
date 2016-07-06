package ru.relesystem.interfaces;


import ru.relesystem.entities.Relay;

public interface EditRele {
    boolean add(Relay relay);
    boolean save(Relay relay);
    boolean delete(Relay relay);
    boolean edit(Relay relay);
}
