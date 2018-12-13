package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.EjeepStop;

@Repository
public interface EjeepStopRepository
	extends JpaRepository<EjeepStop, Long>
{
	public EjeepStop findById(int Id);
	public EjeepStop findByName(String name);
}
