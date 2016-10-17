package ru.relesystem.core.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ru.relesystem.core.entities.location.Station;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context-test.xml")
@Transactional
public class StationDaoTest {
	@Autowired
	LocationDao locationDao;
	@Before
	public void setUp() throws Exception {

		Station station = new Station();
        
		station.setStationName("Монетная");
		locationDao.addLocation(station);
	}

	@Test
	public void findAll() throws Exception {

	}

	@Test
	public void findLocationByName() throws Exception {

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
