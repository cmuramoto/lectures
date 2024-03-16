package com.nc.edu.modules.shared.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.nc.edu.modules.lib.json.JSON;

class EnsureWeakEncapsulation {

	@BeforeAll
	static void prepareCoupling() {
		JSON.reloadModules(new SharedExtensionModule());
	}

	@Test
	void will_encode_request() {
		var ar = new AuthRequest("user", "pass", Set.of(Scope.READ));

		var s = JSON.toMap(ar);

		var m = new LinkedHashMap<>();
		m.put("user", "user");
		m.put("pass", "pass");
		m.put("scopes", List.of(Scope.READ.name()));

		assertEquals(m, s);

		var rec = JSON.parse(AuthRequest.class, JSON.encode(ar));

		assertNotSame(ar, rec);
		assertEquals(ar, rec);
	}

	@Test
	void will_encode_response() {
		var ar = new AuthResponse("token");

		var s = JSON.toMap(ar);

		var m = new LinkedHashMap<>();
		m.put("token", "token");

		assertEquals(m, s);

		var rec = JSON.parse(AuthResponse.class, JSON.encode(ar));

		assertNotSame(ar, rec);
		assertEquals(ar, rec);
	}

}
