package ru.relesystem.core.entities.relaytype;

import org.junit.Assert;
import org.junit.Test;

public class RelayTypeTest {

	@Test
	public void testCreateRelayType() {
		RelayType relayType = new RelayType();
		relayType.setName("НМШ-400");
		Assert.assertEquals("НМШ-400", relayType.getName());

		relayType.setLifetime("100");
		Assert.assertEquals("100", relayType.getLifetime());
	}

}
