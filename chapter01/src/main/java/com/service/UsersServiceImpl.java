package com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.UsersMapper;
import com.model.Users;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Resource
    private UsersMapper usersMapper;
	
	
	public void insert(Users user) {
		usersMapper.insert(user);
	}

	
	public void update(Users user) {
		usersMapper.update(user);		
	}

	
	public void delete(int id) {
        usersMapper.delete(id);		
	}

	
	public Users find(int id) {
		return usersMapper.find(id);
	}

	
}
