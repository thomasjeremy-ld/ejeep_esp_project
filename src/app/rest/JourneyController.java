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

import app.repositories.JourneyRepository;
import app.components.JourneyComponent;
import app.entity.Journey;
import app.entity.SeatOccupancy;

// THIS IS THE SERVICE CLASS
@Component
@Path("/journey")
public class JourneyController 
{
	
	@Autowired
	JourneyComponent service;
	
	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	public Journey createJourney(@FormParam("pN") String plateNumber,
							@FormParam("d") String driver,
							@FormParam("c") String conductor,
							@FormParam("l") Long lineId) throws IOException
	{
		return service.createJourney(plateNumber, driver, conductor, lineId);
	}
	
	@POST
	@Path("/edit")
	@Produces(MediaType.APPLICATION_JSON)
	public Journey editJourney(@FormParam("j") Long journeyId,
							@FormParam("pN") String plateNumber,
							@FormParam("d") String driver,
							@FormParam("c") String conductor,
							@FormParam("l") Long lineId) throws IOException
	{
		return service.editJourney(journeyId, plateNumber, driver, conductor, lineId);
	}
	
	@GET
	@Path("/view")
	@Produces(MediaType.APPLICATION_JSON)
	public Journey viewJourney(@QueryParam("j") Long journeyId) throws IOException
	{
		return service.viewJourney(journeyId);
	}
	
	@POST
	@Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
	public Journey deleteJourney(@FormParam("j") Long journeyId) throws IOException
	{
		return service.deleteJourney(journeyId);
	}
	
	@POST
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	public Journey updateStatus(@FormParam("j") Long journeyId,
								@FormParam("s") String status) throws IOException
	{
		return service.updateStatus(journeyId, status);
	}
	
	@GET
	@Path("/seats")
	@Produces(MediaType.APPLICATION_JSON)
	public SeatOccupancy returnSeats(@QueryParam("j") Long journeyId) throws IOException
	{
		return service.returnSeats(journeyId);
	}
}
