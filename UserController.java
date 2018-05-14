package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.UserDao;
import com.app.model.User;

@RestController
@RequestMapping("/example")
public class UserController {

	@Autowired
	UserDao userDao;
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user){
		
			return userDao.save(user);
		
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userDao.findAll();
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable(value="id") long id){
		User user=userDao.findOne((id));
		if(user==null){
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(user);
	}
	
	@PutMapping("/users/{id}")
	public ResponseEntity<User> update(@PathVariable(value="id") int id, @RequestBody User userDetails){
		User user=userDao.findOne(id);
		if(user==null){
			return ResponseEntity.notFound().build();
		}
		user.setfName(userDetails.getfName());
		user.setId(userDetails.getId());
		user.setlName(userDetails.getlName());
		User updateUser=userDao.save(user);
		return ResponseEntity.ok().body(updateUser);
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<User> delete(@PathVariable(value="id") int id)
	{
		User user=userDao.findOne(id);
		if(user==null){
			return ResponseEntity.notFound().build();
		}
		userDao.delete(user);
		return ResponseEntity.ok().build();
		
	}
	
}
