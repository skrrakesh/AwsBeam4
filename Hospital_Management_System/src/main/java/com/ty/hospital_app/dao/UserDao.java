package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.User;

public interface UserDao {
	public User saveUser(int userId, User user);

	public User getUserId(int userId);

	public boolean deleteUserId(int userId);

	public User updateUserId(int userId, User user);

	public List<User> getAllUser();

	public List<User> getUserByRole(String role);

}
