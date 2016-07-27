package ru.relesystem.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.relesystem.entities.Relay;

import javax.annotation.Resource;
import java.util.List;
@Transactional
@Repository(value = "relayDao")
public class ReleDAOImpl implements ReleDAO{
    private static final Log LOG = LogFactory.getLog(ReleDAOImpl.class);
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional(readOnly=true)
    public List<Relay> getRelays() {
        LOG.info("Invoke getRelays().");
        return sessionFactory.getCurrentSession().createQuery("from Relay r").list();
    }


    @Override
    public Relay getRelaysById(Long id) {
        LOG.info("Invoke getRelaysById().");
        return (Relay) sessionFactory.getCurrentSession().getNamedQuery("Relay.findById").setParameter("id", id).uniqueResult();
    }

    @Override
    public Relay save(Relay relay) {
        sessionFactory.getCurrentSession().saveOrUpdate(relay);
        LOG.info("Relay saved with id: " + relay.getId());
        return relay;
    }

    public SessionFactory getSessionFactory() {
        LOG.info("Invoked getSessionFactory().");
        return sessionFactory;
    }
    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        LOG.info("Invoked setSessionFactory().");
        this.sessionFactory = sessionFactory;
    }
}
