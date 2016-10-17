package ru.relesystem.core.dao;

import java.util.List;

import org.junit.Assert;
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
public class RelayTypeDaoTest {

    @Autowired
    RelayTypeDao relayTypeDao;


    @Before
    public void setUp() throws Exception {
        RelayType relayType = new RelayType();
        relayType.setName("NMSH-800");
        relayType.setLifetime("200");
        relayTypeDao.addType(relayType);
    }
    
    @Test
    public void findAll() throws Exception {
        Assert.assertEquals(1,relayTypeDao.findAll().size());
    }
    
    @Test
    public void findByName() throws Exception {
        RelayType relayType = relayTypeDao.findByName("NMSH-800");
        Assert.assertNotNull(relayType);
        Assert.assertEquals("NMSH-800", relayType.getName());
        Assert.assertEquals("200", relayType.getLifetime());
    }

    @Test
    public void addType() throws Exception {
        RelayType relayType = new RelayType();
        relayType.setName("NMSH-400");
        relayType.setLifetime("100");
        relayTypeDao.addType(relayType);
    }

    @Test
    public void updateType() throws Exception {
        RelayType testUpdateRelay = relayTypeDao.findByName("NMSH-800");
        testUpdateRelay.setLifetime("100");
        relayTypeDao.updateType(testUpdateRelay);
        RelayType updatedRelay = relayTypeDao.findByName("NMSH-800");
        Assert.assertEquals("100", updatedRelay.getLifetime());
    }

    @Test
    public void deleteType() throws Exception {
        RelayType testDeleteRelay = relayTypeDao.findByName("NMSH-800");
    relayTypeDao.deleteType(testDeleteRelay);
        List<RelayType> deletedRelay = relayTypeDao.findAll();
        Assert.assertEquals(0,deletedRelay.size());
    }

}
