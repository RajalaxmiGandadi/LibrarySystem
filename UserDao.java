package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.User;
import com.app.repository.UserRepository;

@Service
public class UserDao {
	
@Autowired
UserRepository userRepo;

//save an employee

public User save(User user){
	return userRepo.save(user);
}

//search all employees

public List<User> findAll(){
	return userRepo.findAll();
	
}
//get an employee

public User findOne(long id){
	return userRepo.findOne(id);
}

//delete an employee

public void delete(User user){
	userRepo.delete(user);
}
}
