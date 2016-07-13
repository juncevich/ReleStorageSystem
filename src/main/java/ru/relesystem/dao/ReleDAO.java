package ru.relesystem.dao;

import ru.relesystem.entities.Relay;

import java.util.List;

public interface ReleDAO {
    List<Relay> getRelays();
    List<Relay> getRelaysById(Relay relayEntity);
}
