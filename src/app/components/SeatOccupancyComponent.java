package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.SeatOccupancy;
import app.repositories.SeatOccupancyRepository;

@Component
public class SeatOccupancyComponent {
	
	@Autowired
	SeatOccupancyRepository repo;
	
}
