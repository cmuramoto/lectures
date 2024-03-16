package com.nc.edu.modules.api.pub;

import com.nc.edu.modules.model.pub.User;

public interface UserService {

	User findById(Long id);

	void save(User u);

}