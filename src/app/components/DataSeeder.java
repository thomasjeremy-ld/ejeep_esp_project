package app.components;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Ejeep;
import app.repositories.EjeepRepository;

@Component
public class DataSeeder 
{
	@Autowired
	private EjeepRepository ejeepRepo;
	
	@PostConstruct
	public void init() 
	{
		if (ejeepRepo.count()== 0)
		{
			Ejeep e = makeEjeep("ABC 1234", "2015-Electric", 20);
			ejeepRepo.save(e);
		}
	}
	
	
	private Ejeep makeEjeep(String plateNumber, String model, Integer capacity) 
	{
		Ejeep e = new Ejeep();
		e.setPlateNumber(plateNumber);
		e.setModel(model);
		e.setCapacity(capacity);
		
		return e;
	}
	
}
