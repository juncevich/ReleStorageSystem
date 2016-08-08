package ru.relesystem.dao;

import ru.relesystem.entities.storage.Stativ;

import java.util.List;


public interface StativDAO {
    List<Stativ> getStatives();

    Stativ getStativById(Long id);

    Stativ save(Stativ stativ);

    void delete(Stativ stativ);
}
