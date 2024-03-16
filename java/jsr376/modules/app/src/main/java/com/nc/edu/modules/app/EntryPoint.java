package com.nc.edu.modules.app;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ServiceLoader;

import com.nc.edu.modules.api.pub.UserService;

public class EntryPoint {

	public static void main(String[] args) {

		var service = ServiceLoader.load(UserService.class).findFirst().orElseThrow(() -> new IllegalStateException("No implementation for " + UserService.class));

		var ep = new EntryPoint(service);

		ep.run();

	}

	final Logger log;

	final UserService service;

	public EntryPoint(UserService service) {
		this.service = service;
		this.log = System.getLogger(EntryPoint.class.getName());
	}

	private void run() {
		log.log(Level.INFO, "Starting ");
	}

}
