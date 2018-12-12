package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.Ejeep;

@Repository
public interface EjeepRepository 
	extends JpaRepository<Ejeep, Long>  // type of the object, type of the PK
{
	public Ejeep findByPlateNumber(String plateNumber);
}
