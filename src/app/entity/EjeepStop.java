package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EjeepStop
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private int previousStop;
	
	@Column
	private int nextStop;
	
	@Column
	private int lineId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPreviousStop() {
		return previousStop;
	}

	public void setPreviousStop(int previousStop) {
		this.previousStop = previousStop;
	}

	public int getNextStop() {
		return nextStop;
	}

	public void setNextStop(int nextStop) {
		this.nextStop = nextStop;
	}

	public int getLineId() {
		return lineId;
	}

	public void setLineId(int lineId) {
		this.lineId = lineId;
	}
	
}
