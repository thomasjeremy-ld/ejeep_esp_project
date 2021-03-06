package app.rest;


import java.io.IOException;

import javax.ws.rs.GET;
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
@Path("/movie")
public class SeatOccupancyController 
{
	
	@Autowired
	SeatOccupancyComponent service;
	
}
