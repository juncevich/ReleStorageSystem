package entities;


import interfaces.Location;
import interfaces.Person;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class ReleTest {
    Rele releWithEmptyConstructor = new Rele();
    @Test
    public void testEmptyReleConstructor(){
        /**
         * Contains the serial number.
         */
        Integer number = null;
        /**
         * Contains type.
         */
        String type = null;
        /**
         * Contains location.
         */
        Location location = null;
        /**
         * Contains the date of the last service.
         */
        Date lastServiceDate = null;
        /**
         * Contains the date of the next service.
         */
        Date nextServiceDate = null;
        /**
         * Contains the date of manufacture.
         */
        Date manufactureDate = null;
        /**
         * Contains responsible person for the relay.
         */
        Person responsiblePerson = null;

        Assert.assertThat(releWithEmptyConstructor.getNumber(), CoreMatchers.is(number));
        Assert.assertThat(releWithEmptyConstructor.getType(), CoreMatchers.is(type));
        Assert.assertThat(releWithEmptyConstructor.getLocation(), CoreMatchers.is(location));
        Assert.assertThat(releWithEmptyConstructor.getLastServiceDate(), CoreMatchers.is(lastServiceDate));
        Assert.assertThat(releWithEmptyConstructor.getNextServiceDate(), CoreMatchers.is(nextServiceDate));
        Assert.assertThat(releWithEmptyConstructor.getManufactureDate(), CoreMatchers.is(manufactureDate));
        Assert.assertThat(releWithEmptyConstructor.getResponsiblePerson(), CoreMatchers.is(responsiblePerson));
    }
}
