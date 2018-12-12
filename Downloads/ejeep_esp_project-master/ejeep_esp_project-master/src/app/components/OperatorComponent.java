package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Operator;
import app.repositories.OperatorRepository;

@Component
public class OperatorComponent {
	
	@Autowired
	OperatorRepository repo;
	
}
