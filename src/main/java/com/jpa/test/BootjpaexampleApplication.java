package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.model.User;
import com.jpa.test.repository.UserRepository;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(BootjpaexampleApplication.class, args);
	UserRepository userRepository= context.getBean(UserRepository.class);
	
	// 1) Create Users
	User user1 = new User();
	user1.setFirstname("Yogita");
	user1.setLastname("Patil");
	user1.setCity("Pune");
	user1.setEmail("yogita14patil@gmail.com");
	user1.setContact("7829126565");
	
	//Saves single entity
	//	User user3=userRepository.save(user2);
	
	User user2 = new User();
	user2.setFirstname("Rushi");
	user2.setLastname("Verlekar");
	user2.setCity("Mumabi");
	user2.setEmail("verlekarrushi@gmail.com");
	user2.setContact("7411827070");
	
	User user3 = new User();
	user3.setFirstname("Nikhil");
	user3.setLastname("Pote");
	user3.setCity("Bangalore");
	user3.setEmail("potenikhil77@gmail.com");
	user3.setContact("9591162396");
	
	
	//Suppose we have multiple users
//	List<User> users = List.of(user1,user2,user3);
//	Iterable<User> result = userRepository.saveAll(users);
//	result.forEach(user ->{
//		System.out.println(user);
//	});
	
	
	
	
	// 2) Update user of id 404
//	Optional<User> optional = userRepository.findById(404);
//	User user = optional.get(); 
//	user.setFirstname("Shubham");
//	userRepository.save(user);
//	System.out.println(user);
	
	
	
	
	// 3) Read user
	//findById(Id) -  return Optional containing our data
	
	//We can read uing iterator
//	Iterable<User> itr = userRepository.findAll();	
//	Iterator<User> iterator = itr.iterator();
//	while(iterator.hasNext()) {
//		User user = iterator.next();
//		System.out.println(user);
//	}
	
	//Orelse using fat arrow function.
//	Iterable<User> itr = userRepository.findAll();	
	//No need to provide bracket for single line of code
//	itr.forEach(user->System.out.println(user));
//	itr.forEach(user->{System.out.println(user);});
	
	
	
	//Delete user
	 userRepository.deleteById(404);
	 System.out.println("Deleted successfuly");	
	
	}
}
