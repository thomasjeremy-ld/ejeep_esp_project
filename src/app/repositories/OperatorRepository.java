package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.Operator;

@Repository
public interface OperatorRepository 
	extends JpaRepository<Operator, Long>  // type of the object, type of the PK
{
	public Operator findByName(String name);
	public Operator findByEmployeeId(String id);
	public Operator findById(Long id);
}
