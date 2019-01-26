package com.mihir.listapp.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.mihir.listapp.dtos.User;
import com.mihir.listapp.root.RootResource;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Users extends RootResource
{

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String addUser(User user)
	{
		return "Added User";
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser()
	{
		User u = new User("mbm12eqwr31", "123", "05-06-1995", "mmehta@gmail.com", "Mihir", "Mehta");
		System.out.println("Here");
		Response rs = Response.status(Status.FOUND).entity(u).build();
		return rs;
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateUser(User user)
	{
		Response rs = null;
		return rs;
	}

}
