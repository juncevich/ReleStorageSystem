package ru.relesystem.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.relesystem.entities.Relay;

@Service("jpaRelayService")
@Repository
@Transactional
public class RelayServiceImpl implements RelayService {
	final static String ALL_CONTACT_NATIVE_QUERY = "select * from relay";

	private Log log = LogFactory.getLog(RelayServiceImpl.class);

	@PersistenceContext
	private EntityManager em;

	@Transactional(readOnly = true)
	@Override
	public List<Relay> findAll() {
		return em.createNamedQuery("Relay.findAll", Relay.class).getResultList();
	}

	@Transactional(readOnly = true)
	@Override
	public List<Relay> findAllWithDetail() {
		return em.createNamedQuery("Relay.findAllWithDetail", Relay.class).getResultList();
	}

	@Transactional(readOnly = true)
	@Override
	public Relay findById(Long id) {
		TypedQuery<Relay> query = em.createNamedQuery("Relay.findById", Relay.class);
		query.setParameter("id", id);

		return query.getSingleResult();
	}

	@Override
	public Relay save(Relay relay) {
		if (relay.getId() == null) {
			log.info("Inserting new relay");
			em.persist(relay);
		} else {
			em.merge(relay);
			log.info("Updating existing relay");
		}

		log.info("Relay saved with id: " + relay.getId());

		return relay;
	}

	@Override
	public void delete(Relay relay) {
		Relay mergedContact = em.merge(relay);
		em.remove(mergedContact);

		log.info("Relay with id: " + relay.getId() + " deleted successfully");
	}

	// @Transactional(readOnly=true)
	// @Override
	// public List<Relay> findAllByNativeQuery() {
	// return em.createNativeQuery(ALL_CONTACT_NATIVE_QUERY,
	// "relayResult").getResultList();
	// }
}
