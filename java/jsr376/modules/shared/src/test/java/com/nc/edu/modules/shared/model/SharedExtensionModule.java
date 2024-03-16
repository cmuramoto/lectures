package com.nc.edu.modules.shared.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.module.SimpleModule;

final class SharedExtensionModule extends SimpleModule {

	static final class AuthRequestMixin {

		@JsonCreator
		AuthRequestMixin(@JsonProperty("user") String user, @JsonProperty("pass") String pass, @JsonProperty("scopes") Set<Scope> scopes) {

		}
	}

	static final class AuthResponseMixin {

		@JsonCreator
		AuthResponseMixin(@JsonProperty("token") String token) {

		}
	}

	private static final long serialVersionUID = 1L;

	public SharedExtensionModule() {
		super("SharedExtensionModule", new Version(1, 0, 0, null, null, null));
	}

	@Override
	public void setupModule(SetupContext context) {
		context.setMixInAnnotations(AuthRequest.class, AuthRequestMixin.class);
		context.setMixInAnnotations(AuthResponse.class, AuthResponseMixin.class);

		super.setupModule(context);
	}
}