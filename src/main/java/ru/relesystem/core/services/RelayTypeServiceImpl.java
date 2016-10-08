package ru.relesystem.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.relesystem.core.dao.RelayTypeDao;
import ru.relesystem.core.entities.relaytype.RelayType;

import java.util.List;

/**
 * Created by alex on 06.10.16.
 */
public class RelayTypeServiceImpl implements RelayTypeService {

    @Autowired
    RelayTypeDao relayTypeDao;

    @Override
    public List<RelayType> findAll() {

        return relayTypeDao.findAll();
    }

    @Override
    public RelayType findById(Long id) {

        return relayTypeDao.findById(id);
    }

    @Override
    public RelayType findByName(String name) {

        return relayTypeDao.findByName(name);
    }

    @Override
    public RelayType addType(RelayType relayType) {

        return relayTypeDao.addType(relayType);
    }

    @Override
    public RelayType updateType(RelayType relayType) {

        return relayTypeDao.updateType(relayType);
    }

    @Override
    public void deleteType(RelayType relayType) {
        relayTypeDao.deleteType(relayType);
    }
}
