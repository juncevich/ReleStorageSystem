package ru.relesystem.core.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

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

		station.setLocationName("Монетная");
		locationDao.addLocation(station);
	}

	@Test
	public void findAll() throws Exception {

		List<Station> locations = (List<Station>) locationDao.findAll();
		assertEquals(1, locations.size());
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
