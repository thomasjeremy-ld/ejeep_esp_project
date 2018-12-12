package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.SeatOccupancy;

@Repository
public interface SeatOccupancyRepository 
	extends JpaRepository<SeatOccupancy, Long>  // type of the object, type of the PK
{
	public SeatOccupancy findByName(String name);
}
