package ru.relesystem.core.services;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ru.relesystem.core.entities.relaytype.RelayType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context-test.xml")
@Transactional
public class RelayTypeServiceImplTest {

	@Autowired
	RelayTypeService relayTypeService;

	@Before
	public void setUp() throws Exception {
		RelayType relayType = new RelayType();
		relayType.setName("NMSH-800");
		relayType.setLifetime("200");
		relayTypeService.addType(relayType);
	}

	@Test
	public void findAll() throws Exception {

		assertEquals(1, relayTypeService.findAll().size());
	}

	@Test
	public void findByName() throws Exception {
        RelayType relayTestFindByName = relayTypeService.findByName("NMSH-800");
        assertEquals("NMSH-800", relayTestFindByName.getName());
        assertEquals("200", relayTestFindByName.getLifetime());
	}

	@Test
	public void addType() throws Exception {
        RelayType relayTestAddType = new RelayType();
        relayTestAddType.setName("NMSH-400");
        relayTestAddType.setLifetime("300");
        relayTypeService.addType(relayTestAddType);
        
        RelayType relayTestAddedType = relayTypeService.findByName("NMSH-400");
	}

	@Test
	public void updateType() throws Exception {
        RelayType relayTestUpdateType = relayTypeService.findByName("NMSH-800");
        relayTestUpdateType.setName("NMSH-600");
        relayTestUpdateType.setLifetime("300");
        relayTypeService.updateType(relayTestUpdateType);
        RelayType relayTestUpdatedType = relayTypeService.findByName("NMSH-600");
        assertEquals("NMSH-600", relayTestUpdatedType.getName());
        assertEquals("300", relayTestUpdatedType.getLifetime());
        
	}

	@Test
	public void deleteType() throws Exception {

        List<RelayType> fisrstRelayList = relayTypeService.findAll();
        assertEquals(1, fisrstRelayList.size());
        RelayType relayTestDeleteType = relayTypeService.findByName("NMSH-800");
        relayTypeService.deleteType(relayTestDeleteType);
        List<RelayType> secondRelayList = relayTypeService.findAll();
        assertEquals(0, secondRelayList.size());
	}

}
