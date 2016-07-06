package ru.relesystem.dao;

import ru.relesystem.entities.RelayEntity;

import java.util.List;

public interface ReleDAO {
    List<RelayEntity> getRelays();
    List<RelayEntity> getRelaysById(RelayEntity relayEntity);
}
