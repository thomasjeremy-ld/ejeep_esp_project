package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.Journey;

@Repository
public interface JourneyRepository 
	extends JpaRepository<Journey, Long>  // type of the object, type of the PK
{
	public Journey findById(Long id);
}
