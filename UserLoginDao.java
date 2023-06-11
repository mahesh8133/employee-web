package com.web.dao;

import com.web.domain.UserLogin;

public interface UserLoginDao {
	public void createLogin(UserLogin userLogin);

	public UserLogin userLogin(UserLogin userLogin);
}
