package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Journey;
import app.repositories.EjeepRepository;
import app.repositories.JourneyRepository;
import app.repositories.OperatorRepository;

@Component
public class JourneyComponent {
	
	@Autowired
	JourneyRepository repo;
	@Autowired
	EjeepRepository repoEjeep;
	@Autowired
	OperatorRepository repoOperator;
	
	public Journey createJourney(String plateNumber, String driver, String conductor, Long lineId)
	{
		Journey j = new Journey();
		
			j.setEjeepId(repoEjeep.findByPlateNumber(plateNumber).getId());
			j.setDriver(repoOperator.findByName(driver).getId());
			j.setConductor(repoOperator.findByName(conductor).getId());
			j.setConductor(lineId);
			j.setStatus("In Transit");
		try
		{		
			repo.save(j);
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return j;
	}
	
	public Journey editJourney(Long journeyId, String plateNumber, String driver, String conductor, Long lineId)
	{
		Journey j = repo.findById(journeyId);
		try 
		{
			if (repoEjeep.findByPlateNumber(plateNumber).getId() != null)
				j.setEjeepId(repoEjeep.findByPlateNumber(plateNumber).getId());
			
			if (repoOperator.findByName(driver).getId() != null)
				j.setDriver(repoOperator.findByName(driver).getId());
			
			if (repoOperator.findByName(conductor).getId() != null)
				j.setConductor(repoOperator.findByName(driver).getId());
			
			if (repoOperator.findByName(conductor).getId() != null)
				j.setConductor(repoOperator.findByName(conductor).getId());
			
			if (lineId != null)
				j.setLineId(lineId);
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return repo.save(j);
	}
	
	public Journey viewJourney(Long journeyId){
		return repo.findById(journeyId);
	}
	
	public Journey deleteJourney(Long journeyId){
		Journey j = repo.findById(journeyId);
		repo.delete(j);
		return j;
	}
	
	public Journey updateStatus(Long journeyId, String status){
		Journey j = repo.findById(journeyId);
		j.setStatus(status);	
		
		return repo.save(j);
	}
}
