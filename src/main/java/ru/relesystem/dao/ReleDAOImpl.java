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
        return sessionFactory.getCurrentSession().createQuery("from Relay r").list();
    }


    @Override
    public List<Relay> getRelaysById(Relay relayEntity) {
        return null;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
