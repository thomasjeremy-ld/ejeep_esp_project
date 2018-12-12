package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Line;
import app.repositories.LineRepository;

@Component
public class LineComponent {
	
	@Autowired
	LineRepository repo;
	
}
