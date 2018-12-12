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

import app.repositories.EjeepRepository;
import app.components.EjeepComponent;
import app.entity.Ejeep;

// THIS IS THE SERVICE CLASS
@Component
@Path("/ejeep")
public class EjeepController 
{
	
	@Autowired
	EjeepComponent service;
	

	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	public Ejeep createEjeep(@FormParam("pN") String plateNumber,
							@FormParam("m") String model,
							@FormParam("c") Integer capacity) throws IOException
	{
		return service.createEjeep(plateNumber, model, capacity);
	}
	
	@POST
	@Path("/edit")
	@Produces(MediaType.APPLICATION_JSON)
	public Ejeep editEjeep(@FormParam("pN") String plateNumber,
							@FormParam("nPN") String newPlateNumber,
							@FormParam("nM") String newModel,
							@FormParam("nC") Integer newCapacity) throws IOException
	{
		return service.editEjeep(plateNumber, newPlateNumber, newModel, newCapacity);
	}
	
	@GET
	@Path("/view")
	@Produces(MediaType.APPLICATION_JSON)
	public Ejeep viewEjeep(@QueryParam("pN") String plateNumber) throws IOException
	{
		return service.viewEjeep(plateNumber);
	}
	
	@POST
	@Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
	public Ejeep deleteEjeep(@FormParam("pN") String plateNumber) throws IOException
	{
		return service.deleteEjeep(plateNumber);
	}
	
	@POST
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	public Ejeep updateStatus(@FormParam("pN") String plateNumber,
								@FormParam("s") String status) throws IOException
	{
		return service.updateStatus(plateNumber, status);
	}
}
