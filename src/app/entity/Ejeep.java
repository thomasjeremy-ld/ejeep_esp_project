package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ejeep 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  // autoincrement
	@Column
	private Long id;
	
	@Column
	private String plateNumber;

	@Column
	private String model;
	
	@Column
	private String status;
	
	@Column
	private Integer capacity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Ejeep [id=" + id + ", plateNumber=" + plateNumber + ", model=" + model + ", status=" + status
				+ ", capacity=" + capacity + "]";
	}
}
