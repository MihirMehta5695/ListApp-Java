package com.mihir.listapp.services;

import java.util.ArrayList;

import org.hibernate.Session;

import com.mihir.listapp.dtos.User;

public class UserServices
{

	ArrayList<User> users=new ArrayList<>();
	
	public UserServices()
	{
		User u1 = new User("mbm", "123", "05-06-1995","mmehta@gmail.com", "Mihir", "Mehta");
		users.add(u1);
	}
	
	public User addUser(User user, Session session)
	{
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		return user;
	}
	
	public User getUser()
	{
		return users.get(0);
	}

}
