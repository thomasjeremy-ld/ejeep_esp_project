package app.rest;


import java.io.IOException;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.repositories.LineRepository;
import app.components.LineComponent;
import app.components.LineComponent;
import app.entity.Line;
import app.entity.Line;

// THIS IS THE SERVICE CLASS
@Component
@Path("/line")
public class LineController 
{
	
	@Autowired
	LineComponent service;
	
	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	public Line createLine(@FormParam("n") String name) throws IOException
	{
		return service.createLine(name);
	}
	
	@POST
	@Path("/edit")
	@Produces(MediaType.APPLICATION_JSON)
public Line editLine(@FormParam("o") String oldName,
					@FormParam("n") String name) throws IOException

	{
		return service.editLine(oldName, name);
	}
	
	@GET
	@Path("/view")
	@Produces(MediaType.APPLICATION_JSON)
	public Line viewLine(@QueryParam("n") String name) throws IOException
	{
		return service.viewLine(name);
	}
	
	@POST
	@Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
	public Line deleteLine(@FormParam("n") String name) throws IOException
	{
		return service.deleteLine(name);
	}
	
}
