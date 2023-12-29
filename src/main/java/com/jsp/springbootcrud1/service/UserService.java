package com.jsp.springbootcrud1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springbootcrud1.dao.UserDao;
import com.jsp.springbootcrud1.dto.User;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	
	
	public User saveUser(User user) {
		return userDao.saveUser(user);
		
	}
	
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}
	
	
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}
	
	public boolean deleteUserById(int id) {
		return userDao.deleteUserById(id);
	}
	
	public User updateUserById(int id, User user) {
		User u = userDao.getUserById(id);
		if(u != null) {
			u.setName(user.getName());
			u.setEmail(user.getEmail());
		return userDao.updateUserById(id, u);
		}
		else {
			return null;
		}
	}
	
	
	
	public User validateUser(String email, String password) {
		return userDao.validateUser(email, password);
	}

}
