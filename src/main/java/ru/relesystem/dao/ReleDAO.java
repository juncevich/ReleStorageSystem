package ru.relesystem.dao;

import ru.relesystem.entities.Relay;

import java.util.List;

public interface ReleDAO {
    List getRelays();

    Relay getRelaysById(Long id);

    Relay save(Relay relay);

    void delete(Relay relay);
}
