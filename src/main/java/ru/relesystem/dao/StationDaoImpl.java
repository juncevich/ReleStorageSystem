package ru.relesystem.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.relesystem.entities.location.Station;

import java.util.List;

@Transactional
@Repository(value = "stationDao")
public class StationDaoImpl implements StationDao {
    private static final Log LOG = LogFactory.getLog(StativDAOImpl.class);
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Station> getStations() {
        LOG.info("Invoke getStations().");
        return sessionFactory.getCurrentSession().createQuery("from Station s").list();
    }

    @Override
    public Station getStationsById(Long id) {

        LOG.info("Invoke getStationsById().");
        return (Station) sessionFactory.getCurrentSession().getNamedQuery("Station.findById").setParameter("id", id).uniqueResult();
    }

    @Override
    public Station save(Station station) {
        sessionFactory.getCurrentSession().saveOrUpdate(station);
        LOG.info("Station saved with id: " + station.getId());
        return station;
    }
}
