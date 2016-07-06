package ru.relesystem.entities;


import ru.relesystem.interfaces.Person;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class RelayTest {
    private final Relay relayWithEmptyConstructor = new Relay();

    @Test
    public void testEmptyReleConstructor(){


        Assert.assertThat(relayWithEmptyConstructor.getNumber(), CoreMatchers.is((Integer) null));
        Assert.assertThat(relayWithEmptyConstructor.getType(), CoreMatchers.is((String) null));
        Assert.assertThat(relayWithEmptyConstructor.getShelveNumber(), CoreMatchers.is(0));
        Assert.assertThat(relayWithEmptyConstructor.getShelvePosition(), CoreMatchers.is(0));
        Assert.assertThat(relayWithEmptyConstructor.getLastServiceDate(), CoreMatchers.is((Date) null));
        Assert.assertThat(relayWithEmptyConstructor.getNextServiceDate(), CoreMatchers.is((Date) null));
        Assert.assertThat(relayWithEmptyConstructor.getManufactureDate(), CoreMatchers.is((Date) null));
        Assert.assertThat(relayWithEmptyConstructor.getResponsiblePerson(), CoreMatchers.is((Person) null));
    }


}
