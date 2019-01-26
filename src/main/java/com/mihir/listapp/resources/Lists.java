package com.mihir.listapp.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mihir.listapp.root.RootResource;

@Path("/lists")
public class Lists extends RootResource
{

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String fetchTestMessage()
	{
		return "Test Message";
	}

	@Path("/{listId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String fetchList(@PathParam("listId") String listId)
	{
		return ("List Id Recieved : " + listId);
	}

	@POST
	@Produces
	public String addList()
	{
		return "Added to List";
	}

}
