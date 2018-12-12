package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Journey;
import app.repositories.JourneyRepository;

@Component
public class JourneyComponent {
	
	@Autowired
	JourneyRepository repo;
	
}
