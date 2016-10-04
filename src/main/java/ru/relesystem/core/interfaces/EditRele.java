package ru.relesystem.core.interfaces;

import ru.relesystem.core.entities.Relay;

public interface EditRele {
    boolean add(Relay relay);

    boolean save(Relay relay);

    boolean delete(Relay relay);

    boolean edit(Relay relay);
}
