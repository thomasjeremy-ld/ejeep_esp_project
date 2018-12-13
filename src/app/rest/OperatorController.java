package app.rest;


import java.io.IOException;
import java.sql.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.repositories.OperatorRepository;
import app.components.OperatorComponent;
import app.entity.Operator;

// THIS IS THE SERVICE CLASS
@Component
@Path("/operator")
public class OperatorController 
{
	
	@Autowired
	OperatorComponent service;
	
	@GET
	@Path("/create")
	@Produces(MediaType.TEXT_PLAIN)
	public String createOperator(@QueryParam("employeeId") String employeeId, 
									@QueryParam("name") String name, 
									@QueryParam("birthday") String birthday) throws IOException
	{
		service.createOperator(employeeId, name, birthday);
		return("You have successfully creator Operator#" + employeeId.toString() + ", " + name.toString() + ", " + "Birthday" + birthday.toString());
	}
	
	@GET
	@Path("/edit")
	@Produces(MediaType.TEXT_PLAIN)
	public String editOperator(@QueryParam("employeeId") String employeeId, @QueryParam("newemployeeId") String newemployeeId, @QueryParam("name") String name, @QueryParam("birthday") Date birthday) throws IOException
	{
		service.editOperator(employeeId, newemployeeId, name, birthday);
		return("You have successfully edited Operator#" + employeeId.toString() + ", " + name.toString() + ", " + "Birthday" + birthday.toString());
	}
	
	@GET
	@Path("/delete")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteOperator(@QueryParam("employeeId") String employeeId) throws IOException
	{
		service.deleteOperator(employeeId);
		return("You have successfully deleted Operator#" + employeeId.toString());
	}
	
	@GET
	@Path("/view")
	@Produces(MediaType.TEXT_PLAIN)
	public String viewOperator(@QueryParam("employeeId") String employeeId) throws IOException
	{
		return service.viewOperator(employeeId);
	}
	
}
