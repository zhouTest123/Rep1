package com.service;

import com.model.Users;

public interface UsersService {
	public void insert(Users user);

	public void update(Users user);

	public void delete(int id);

	public Users find(int id);
}
