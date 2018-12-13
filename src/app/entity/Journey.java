package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Journey 
{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  // autoincrement
	@Column
	private Long id;
	
	@NotNull
	@Column	
	private Long ejeepId;
	
	@Column
	private Long driver;
	
	@Column
	private Long conductor;

	@Column
	private Long lineId;
	
	@Column
	private Long currentStop;
	
	@Pattern(regexp = "In Transit|Ended", flags = Pattern.Flag.CASE_INSENSITIVE)
	@Column
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEjeepId() {
		return ejeepId;
	}

	public void setEjeepId(Long ejeepId) {
		this.ejeepId = ejeepId;
	}

	public Long getDriver() {
		return driver;
	}

	public void setDriver(Long driver) {
		this.driver = driver;
	}

	public Long getConductor() {
		return conductor;
	}

	public void setConductor(Long conductor) {
		this.conductor = conductor;
	}

	public Long getLineId() {
		return lineId;
	}

	public void setLineId(Long lineId) {
		this.lineId = lineId;
	}

	public Long getCurrentStop() {
		return currentStop;
	}

	public void setCurrentStop(Long currentStop) {
		this.currentStop = currentStop;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Journey [id=" + id + ", ejeepId=" + ejeepId + ", driver=" + driver + ", conductor=" + conductor
				+ ", lineId=" + lineId + ", currentStop=" + currentStop + ", status=" + status + "]";
	}
	
}
