package com.dao;

import org.apache.ibatis.annotations.Mapper;

import com.model.Users;

@Mapper
public interface UsersMapper {
	public void insert(Users user);

    public void update(Users user);
    
    public void delete(int id);
    
    public Users find(int id);
}
