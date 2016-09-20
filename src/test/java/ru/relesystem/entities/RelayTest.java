package ru.relesystem.entities;

import org.junit.Assert;
import org.junit.Test;

import ru.relesystem.core.entities.Relay;

public class RelayTest {

	private final Relay relayWithEmptyConstructor = new Relay();

	@Test
	public void testEmptyReleConstructor() {

		Assert.assertEquals(relayWithEmptyConstructor.getNumber(), null);
		Assert.assertEquals(relayWithEmptyConstructor.getType(), null);
		Assert.assertEquals(relayWithEmptyConstructor.getShelvePosition(), null);
		// Assert.assertThat(relayWithEmptyConstructor.getLastServiceDate(),
		// CoreMatchers.is((Date) null));
		// Assert.assertThat(relayWithEmptyConstructor.getNextServiceDate(),
		// CoreMatchers.is((Date) null));
		// Assert.assertThat(relayWithEmptyConstructor.getManufactureDate(),
		// CoreMatchers.is((Date) null));
		// Assert.assertThat(relayWithEmptyConstructor.getResponsiblePerson(),
		// CoreMatchers.is((Person) null));
	}

	@Test
	public void testNewRelay() {
		Relay relay = new Relay();
		relay.setNumber("12345");
		Assert.assertEquals("12345", relay.getNumber());
	}

}
