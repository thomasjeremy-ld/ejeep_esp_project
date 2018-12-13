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

import app.repositories.SeatOccupancyRepository;
import app.components.SeatOccupancyComponent;
import app.entity.SeatOccupancy;

// THIS IS THE SERVICE CLASS
@Component
@Path("/seat")
public class SeatOccupancyController 
{
	
	@Autowired
	SeatOccupancyComponent service;
	
	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	public SeatOccupancy createSeatOccupancy(@FormParam("jI") Long journeyId,
							@FormParam("jS") Long jeepStopId,
							@FormParam("c") Integer occupancyCount) throws IOException
	{
		return service.createSeatOccupancy(journeyId, jeepStopId, occupancyCount);
	}
	
	@POST
	@Path("/edit")
	@Produces(MediaType.APPLICATION_JSON)
public SeatOccupancy editSeatOccupancy(@FormParam("sI") Long seatOccupancyId,
										@FormParam("jI") Long journeyId,										
										@FormParam("jS") Long jeepStopId,
										@FormParam("c") Integer occupancyCount) throws IOException

	{
		return service.editSeatOccupancy(seatOccupancyId, journeyId, jeepStopId, occupancyCount);
	}
	
	@GET
	@Path("/view")
	@Produces(MediaType.APPLICATION_JSON)
	public SeatOccupancy viewSeatOccupancy(@QueryParam("s") Long seatOccupancyId) throws IOException
	{
		return service.viewSeatOccupancy(seatOccupancyId);
	}
	
	@POST
	@Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
	public SeatOccupancy deleteSeatOccupancy(@FormParam("s") Long seatOccupancyId) throws IOException
	{
		return service.deleteSeatOccupancy(seatOccupancyId);
	}
}
