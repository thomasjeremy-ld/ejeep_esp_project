package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.EjeepStop;

@Repository
public interface EjeepStopRepository 
	extends JpaRepository<EjeepStop, Long>  // type of the object, type of the PK
{
	public EjeepStop findByName(String name);
}
