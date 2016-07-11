package ru.relesystem.dao;

import java.util.List;

public interface ReleDAO {
    List<Relay> getRelays();
    List<Relay> getRelaysById(Relay relayEntity);
}
