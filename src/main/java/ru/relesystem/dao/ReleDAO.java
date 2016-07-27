package ru.relesystem.dao;

import ru.relesystem.entities.Relay;

import java.util.List;

public interface ReleDAO {
    List<Relay> getRelays();
    Relay getRelaysById(Long id);
}
