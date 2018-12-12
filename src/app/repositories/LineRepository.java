package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.Line;

@Repository
public interface LineRepository 
	extends JpaRepository<Line, Long>  // type of the object, type of the PK
{
	public Line findByName(String name);
}
