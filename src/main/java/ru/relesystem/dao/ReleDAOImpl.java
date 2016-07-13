package ru.relesystem.dao;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.relesystem.entities.Relay;

import java.util.List;
@Component(value = "relayDao")
public class ReleDAOImpl implements ReleDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @Override
    public List<Relay> getRelays() {
        List<Relay> relays = (List<Relay>) sessionFactory.getCurrentSession()
                .createCriteria(Relay.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
        return relays;
    }

    @Override
    public List<Relay> getRelaysById(Relay relayEntity) {
        return null;
    }
}
