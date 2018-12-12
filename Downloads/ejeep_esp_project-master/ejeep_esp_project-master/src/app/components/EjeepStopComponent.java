package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.EjeepStop;
import app.repositories.EjeepStopRepository;

@Component
public class EjeepStopComponent {
	
	@Autowired
	EjeepStopRepository repo;
	
}
