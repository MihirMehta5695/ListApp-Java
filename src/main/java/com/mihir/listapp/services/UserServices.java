package com.mihir.listapp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.Response.StatusType;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mihir.listapp.dtos.User;

public class UserServices
{

	ArrayList<User> users = new ArrayList<>();

	public UserServices()
	{
		User u1 = new User("mbm", "123", "05-06-1995", "mmehta@gmail.com", "Mihir", "Mehta");
		users.add(u1);
	}

	public Response addUser(User user, Session session)
	{
		Response resp = null;
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			session.close();
			sessionFactory.close();
			resp = Response.status(Status.CREATED).entity(user).build();

		}
		catch (HibernateException e)
		{
			e.printStackTrace();
			resp = Response.status(Status.fromStatusCode(422)).build();
		}

		catch (Exception e)
		{
			e.printStackTrace();
			resp = Response.status(Status.BAD_REQUEST).build();
		}
		return resp;

	}

	public User getUser()
	{
		return users.get(0);
	}

}
