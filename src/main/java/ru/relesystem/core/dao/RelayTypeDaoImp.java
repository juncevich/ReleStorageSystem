package ru.relesystem.core.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.relesystem.core.entities.relaytype.RelayType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository("relayTypeDao")
@Transactional
public class RelayTypeDaoImp implements RelayTypeDao {

	private Log log = LogFactory.getLog(RelayTypeDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<RelayType> findAll() {

		return entityManager.createNamedQuery("RelayType.findAll", RelayType.class).getResultList();
	}

	@Override
	public RelayType findById(Long id) {

		TypedQuery<RelayType> query = entityManager.createNamedQuery("Relay.findById", RelayType.class);
		query.setParameter("id", id);
		return query.getSingleResult();
	}

	@Override
	public RelayType findByName(String name) {
		log.info("Find relay type: " + name);
		TypedQuery<RelayType> query = entityManager.createNamedQuery("RelayType.findByName", RelayType.class);
		query.setParameter("name", name);
		return query.getSingleResult();
	}

	@Override
	public RelayType addType(RelayType relayType) {
		log.info("Add relay type: " + relayType.getName());
		entityManager.persist(relayType);
		return relayType;
	}

	@Override
	public RelayType updateType(RelayType relayType) {

		log.info("Updating relay type with " + relayType.getId() + " id.");
		entityManager.merge(relayType);
		return relayType;
	}

	@Override
	public void deleteType(RelayType relayType) {
		RelayType deletedRelayType = entityManager.merge(relayType);
		log.info("Delete relay type: " + relayType.getId());
		entityManager.remove(deletedRelayType);
		log.info("Relay type with id: " + relayType.getId() + " deleted successfully");
	}
}
