package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Ejeep;
import app.repositories.EjeepRepository;

@Component
public class EjeepComponent {
	
	@Autowired
	EjeepRepository repo;
	
	public Ejeep createEjeep(String plateNumber,String model,Integer capacity)
	{
		Ejeep ej = new Ejeep();

			ej.setPlateNumber(plateNumber);
			ej.setModel(model);
			ej.setCapacity(capacity);
		try
		{		
			repo.save(ej);
		}
		catch (Exception e) 
		{
			System.out.println(e);
			System.out.println("LOLOOL");
		}
		return ej;
	}
	
	public Ejeep editEjeep(String plateNumber, String newPlateNumber, String newModel, Integer newCapacity)
	{
		Ejeep ej = repo.findByPlateNumber(plateNumber);
		try 
		{
			if (newPlateNumber != null && !newPlateNumber.isEmpty())
				ej.setPlateNumber(newPlateNumber);
			
			if (newModel != null && !newModel.isEmpty())
				ej.setModel(newModel);
			
			if (newCapacity != null)
				ej.setCapacity(newCapacity);
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return repo.save(ej);
	}
	
	public Ejeep viewEjeep(String plateNumber){
		return repo.findByPlateNumber(plateNumber);
	}
	
	public Ejeep deleteEjeep(String plateNumber){
		Ejeep ej = repo.findByPlateNumber(plateNumber);
		repo.delete(ej);
		return ej;
	}
	
	public Ejeep updateStatus(String plateNumber, String status){
		Ejeep ej = repo.findByPlateNumber(plateNumber);
		ej.setStatus(status);	
		
		return repo.save(ej);
	}
}
