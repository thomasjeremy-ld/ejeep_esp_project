package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Ejeep 
{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  // autoincrement
	@Column
	private Long id;
	
	@NotNull
	@Column(unique=true)
	private String plateNumber;
	
	@Column
	private String model;
	
	@Pattern(regexp = "In Transit|Parked|Charging", flags = Pattern.Flag.CASE_INSENSITIVE)
	@Column
	private String status;
	
	@NotNull
	@Min(2)
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
