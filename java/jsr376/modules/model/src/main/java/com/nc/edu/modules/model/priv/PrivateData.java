package com.nc.edu.modules.model.priv;

public class PrivateData {

	String salt;

	String hash;

	public String getHash() {
		return hash;
	}

	public String getSalt() {
		return salt;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

}
