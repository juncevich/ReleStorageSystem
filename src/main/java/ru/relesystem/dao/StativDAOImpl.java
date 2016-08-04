package ru.relesystem.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.relesystem.entities.storage.Stativ;

import java.util.List;

@Transactional
@Repository(value = "stativDao")
public class StativDAOImpl implements StativDAO {
    private static final Log LOG = LogFactory.getLog(StativDAOImpl.class);
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Stativ> getStatives() {
        LOG.info("Invoke getStatives().");
        return sessionFactory.getCurrentSession().createQuery("from Stativ s").list();
    }

    @Override
    public Stativ getStativById(Long id) {

        LOG.info("Invoke getStativeById().");
        return (Stativ) sessionFactory.getCurrentSession().getNamedQuery("Stativ.findById").setParameter("id", id).uniqueResult();
    }

    @Override
    public Stativ save(Stativ stativ) {
        sessionFactory.getCurrentSession().saveOrUpdate(stativ);
        LOG.info("Stativ saved with id: " + stativ.getId());
        return stativ;
    }
}
