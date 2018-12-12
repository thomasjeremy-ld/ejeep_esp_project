package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Ejeep;
import app.repositories.EjeepRepository;

@Component
public class EjeepComponent {
	
	@Autowired
	EjeepRepository repo;
	
}
