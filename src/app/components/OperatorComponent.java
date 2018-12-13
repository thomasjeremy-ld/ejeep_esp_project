package app.components;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Operator;
import app.repositories.OperatorRepository;

@Component
public class OperatorComponent{
	
	@Autowired
	OperatorRepository repo;
	
	public void createOperator(String employeeId, String name, String birthday)
	{
		Operator temp = new Operator();
		
		temp.setEmployeeId(employeeId);
		temp.setName(name);
		
		
		repo.save(temp);
	}
	
	public void editOperator(String employeeId, String newemployeeId, String name, Date birthday)
	{
		Operator temp = repo.findByEmployeeId(employeeId);
		
		temp.setEmployeeId(newemployeeId);
		temp.setName(name);
		temp.setBirthday(birthday);
		
		repo.save(temp);
		
	}
	
	public void deleteOperator(String employeeId)
	{
		repo.delete(repo.findByEmployeeId(employeeId));
	}
	
	public String viewOperator(String employeeId)
	{
		Operator temp = repo.findByEmployeeId(employeeId);
		
		return("Employee ID:" + temp.getEmployeeId() + System.lineSeparator() + "Name:" + temp.getName() + System.lineSeparator() + "Birthday:" + temp.getBirthday());		
	}
	
}
