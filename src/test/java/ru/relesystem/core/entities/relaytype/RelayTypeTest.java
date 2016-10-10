package ru.relesystem.core.entities.relaytype;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class RelayTypeTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCreateRelayType() {
        RelayType relayType = new RelayType();
        relayType.setName("НМШ-400");
        Assert.assertEquals("НМШ-400", relayType.getName());
    }

}
