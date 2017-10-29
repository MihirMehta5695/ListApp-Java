package com.mihir.listapp.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.hibernate.Session;

import com.mihir.listapp.dtos.User;
import com.mihir.listapp.hibernate.HibernateUtils;
import com.mihir.listapp.services.UserServices;

@Path("users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource
{

	UserServices userServices = new UserServices();
	Session session = null;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addUser(User user)
	{
		System.out.println("New");
		System.out.println("User Data : " + user);
		session = new HibernateUtils().getSession();
		return userServices.addUser(user, session);
	}
	
	@GET
	public User getUser()
	{
		System.out.println("Here");
		return userServices.getUser();
	}
	
	/*@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt()
	{
		return "Got it!";
	}*/
	
}
