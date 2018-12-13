package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Line;
import app.repositories.LineRepository;

@Component
public class LineComponent {
	
	@Autowired
	LineRepository repo;
	
	public Line createLine(String name)
	{
		Line l = new Line();
		l.setName(name);
		return repo.save(l);
	}
	
	public Line editLine(String oldName, String name)
	{
		Line l = repo.findByName(oldName);
		
		if (name != null && !name.isEmpty())
			l.setName(name);
		
		return repo.save(l);
	}
	
	public Line viewLine(String name)
	{
		return repo.findByName(name);
	}
	
	public Line deleteLine(String name)
	{
		Line l = repo.findByName(name);
		repo.delete(l);
		
		return l;
	}
}
