package com.nc.edu.modules.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.LinkedHashMap;

import org.junit.jupiter.api.Test;

import com.nc.edu.modules.lib.json.JSON;
import com.nc.edu.modules.model.internal.Statistics;
import com.nc.edu.modules.model.priv.PrivateData;
import com.nc.edu.modules.model.pub.User;

class EnsureStrongEncapsulation {

	@Test
	void will_encode_internal() {
		assertThrows(UnsupportedOperationException.class, () -> {
			var pd = new Statistics();
			pd.setErrors(1L);
			pd.setRequests(100);

			var s = JSON.stringify(pd);

			fail(s);
		});
	}

	@Test
	void will_encode_public() {
		var u = new User();
		u.setId(1L);
		u.setName("John");

		var s = u.toString();

		var m = new LinkedHashMap<>();
		m.put("id", 1L);
		m.put("name", "John");

		assertEquals(JSON.stringify(m), s);
	}

	@Test
	void will_not_encode_private() {
		assertThrows(UnsupportedOperationException.class, () -> {
			var pd = new PrivateData();
			pd.setHash("hash");
			pd.setSalt("salt");

			var s = JSON.stringify(pd);

			fail(s);
		});
	}

}
