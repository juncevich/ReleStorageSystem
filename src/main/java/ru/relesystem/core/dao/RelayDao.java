package ru.relesystem.core.dao;

import org.joda.time.DateTime;
import ru.relesystem.core.entities.Relay;

import java.util.List;

/**
 * Relay DAO
 */
public interface RelayDao {
    List<Relay> findAll();

    List<Relay> findByStation(String stationName);

    List<Relay> findAllWithDetail();

    Relay findById(Long id);

    Relay findBySerialNumber(String serialNumber);

    List<Relay> findByManufactureDate(DateTime manufactureDate);

    List<Relay> findByLastServiceDate(DateTime lastServiceDate);

    List<Relay> findByNextServiceDate(DateTime nextServiceDate);

    Relay save(Relay relay);

    void delete(Relay relay);
}
