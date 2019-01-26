package com.mihir.listapp.services;

import java.util.ArrayList;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.mihir.listapp.dtos.User;
import com.mihir.listapp.root.RootService;

public class UsersServices extends RootService
{

	ArrayList<User> users = new ArrayList<>();

	public UsersServices()
	{
	}

	public Response addUser(User user, Session session)
	{
		Response resp = null;
		try
		{
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			session.close();
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
		if (users != null && users.size() > 0)
		{

		}
		return users.get(0);
	}

}
