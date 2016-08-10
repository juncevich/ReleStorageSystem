package ru.relesystem.services;

import ru.relesystem.entities.Relay;

import java.util.List;

public interface RelayService {
    List<Relay> findAll();
    List<Relay> findAllWithDetail();
    Relay findById(Long id);
    Relay save(Relay relay);
    void delete(Relay relay);
    List<Relay> findAllByNativeQuery();
}
