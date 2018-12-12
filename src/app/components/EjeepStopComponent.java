package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.EjeepStop;
import app.repositories.EjeepStopRepository;

@Component
public class EjeepStopComponent
{
	@Autowired
	EjeepStopRepository repo;
	
	public EjeepStop createEjeepStop(String name, int previousStop, int nextStop, int lineId)
	{
		EjeepStop ejs = new EjeepStop();
		
		ejs.setName(name);
		ejs.setPreviousStop(previousStop);
		ejs.setNextStop(nextStop);
		ejs.setLineId(lineId);
		
		repo.save(ejs);
		
		return ejs;
	}
	
	public EjeepStop editEjeepStop(String name, String newname, int previousStop, int nextStop, int lineId)
	{
		EjeepStop ejs = repo.findByName(name);
		
		ejs.setName(newname);
		ejs.setPreviousStop(previousStop);
		ejs.setNextStop(nextStop);
		ejs.setLineId(lineId);
		
		repo.save(ejs);
		
		return ejs;
	}
	
	public EjeepStop viewEjeepStop(String name)
	{
		EjeepStop ejs = repo.findByName(name);
		
		return ejs;
	}
	
	public EjeepStop deleteEjeepStop(String name)
	{
		EjeepStop ejs = repo.findByName(name);
		repo.delete(ejs);
		return ejs;
	}
	
}