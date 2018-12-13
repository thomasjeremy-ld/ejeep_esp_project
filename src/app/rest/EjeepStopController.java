package app.rest;

import java.io.IOException;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.components.EjeepStopComponent;
import app.entity.EjeepStop;

@Component
@Path("/ejeepstop")
public class EjeepStopController
{
	@Autowired 
	EjeepStopComponent service;
	
	@GET
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	public EjeepStop createEjeepStop(@QueryParam("name") String name,
							@QueryParam("previousStop") Integer previousStop,
							@QueryParam("nextStop") Integer nextStop, 
							@QueryParam("lineId") Integer lineId) throws IOException
	{
		return service.createEjeepStop(name, previousStop, nextStop, lineId);
	}
	
	@GET
	@Path("/edit")
	@Produces(MediaType.APPLICATION_JSON)
	public EjeepStop editEjeepStop(@QueryParam("name") String name, @QueryParam("newname") String newname,
							@QueryParam("previousStop") Integer previousStop,
							@QueryParam("nextStop") Integer nextStop, @QueryParam("lineId") Integer lineId) throws IOException
	{
		return service.editEjeepStop(name, newname, previousStop, nextStop, lineId);
	}
	
	@GET
	@Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
	public EjeepStop deleteEjeepStop(@QueryParam("name") String name) throws IOException
	{
		return service.deleteEjeepStop(name);
	}
	
	@GET
	@Path("/view")
	@Produces(MediaType.APPLICATION_JSON)
	public EjeepStop viewEjeepStop(@QueryParam("name") String name) throws IOException
	{
		return service.viewEjeepStop(name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}