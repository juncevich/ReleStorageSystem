package ru.relesystem.core.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.relesystem.core.entities.relaytype.RelayType;

/**
 * Created by alex on 08.10.16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context-test.xml")
public class RelayTypeDaoTest {

    @Autowired
    RelayTypeDao relayTypeDao;


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void findAll() throws Exception {

    }

    @Test
    public void findById() throws Exception {

    }

    @Test
    public void findByName() throws Exception {

    }

    @Test
    public void addType() throws Exception {
        RelayType relayType = new RelayType();
        relayType.setName("НМШ-400");
        relayType.setLifetime("100");
        relayTypeDao.addType(relayType);
    }

    @Test
    public void updateType() throws Exception {

    }

    @Test
    public void deleteType() throws Exception {

    }

}