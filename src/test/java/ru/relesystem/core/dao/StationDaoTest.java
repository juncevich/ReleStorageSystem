package ru.relesystem.core.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ru.relesystem.core.entities.Relay;
import ru.relesystem.core.entities.location.Station;
import ru.relesystem.core.entities.relaytype.RelayType;
import ru.relesystem.core.entities.storage.Stativ;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context-test.xml")
@Transactional
public class StationDaoTest {
	@Autowired
	LocationDao locationDao;
	@Before
	public void setUp() throws Exception {

		Station station = new Station();
		Stativ stativ100 = new Stativ(100);
		Relay testRelay = new Relay();
		RelayType testTypeNMSH400 = new RelayType();
		testTypeNMSH400.setName("NMSH-400");
		testTypeNMSH400.setLifetime("100");
		testRelay.setType(testTypeNMSH400);
		stativ100.addRele(testRelay);
		station.setLocationName("Монетная");
		station.addStativ(stativ100);
		locationDao.addLocation(station);
	}

	@Test
	public void findAll() throws Exception {

		List<Station> locations = (List<Station>) locationDao.findAll();
		assertEquals(1, locations.size());
	}

	@Test
	public void findLocationByName() throws Exception {
		Station foundedByName = locationDao.findLocationByName("Монетная");
		assertNotNull(foundedByName);
		assertEquals("Монетная", foundedByName.getLocationName());
		assertEquals("100", foundedByName.getStorageList().get(0).getNum().toString());
		assertEquals("NMSH-400", foundedByName.getStorageList().get(0).getRelaysOnStativ().get(0).getType().getName());
		assertEquals("100", foundedByName.getStorageList().get(0).getRelaysOnStativ().get(0).getType().getLifetime());
		
		
	}

	@Test
	public void findRelayByLocationName() throws Exception {

	}

	@Test
	public void findStoragesByLocationName() throws Exception {

	}

	@Test
	public void addLocation() throws Exception {

	}

	@Test
	public void updateLocation() throws Exception {

	}

	@Test
	public void deleteLocation() throws Exception {

	}

}
