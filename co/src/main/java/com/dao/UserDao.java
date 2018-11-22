package com.dao;

import org.springframework.stereotype.Repository;

import com.pojo.User;
@Repository
public interface UserDao {
	public User getUser(long id);
	public int insert(User user);
}
