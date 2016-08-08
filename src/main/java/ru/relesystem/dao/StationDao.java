package ru.relesystem.dao;


import ru.relesystem.entities.location.Station;

import java.util.List;

public interface StationDao {
    List<Station> getStations();

    Station getStationsById(Long id);

    Station save(Station station);

    void delete(Station station);
}
