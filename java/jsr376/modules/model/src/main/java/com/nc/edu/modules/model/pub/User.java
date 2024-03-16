package com.nc.edu.modules.model.pub;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.nc.edu.modules.lib.json.JSON;

@JsonPropertyOrder({ "id", "name" })
public class User {

	Long id;

	String name;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return JSON.stringify(this);
	}

}