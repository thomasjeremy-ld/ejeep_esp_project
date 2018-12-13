package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class SeatOccupancy 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  // autoincrement
	@Column
	private Long id;
	
	@NotNull
	@Column	
	private Long journeyId;
	
	@Column
	private Long jeepStopId;
	
	@Column
	private Integer occupancyCount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(Long journeyId) {
		this.journeyId = journeyId;
	}

	public Long getJeepStopId() {
		return jeepStopId;
	}

	public void setJeepStopId(Long jeepStopId) {
		this.jeepStopId = jeepStopId;
	}

	public Integer getOccupancyCount() {
		return occupancyCount;
	}

	public void setOccupancyCount(Integer occupancyCount) {
		this.occupancyCount = occupancyCount;
	}

	@Override
	public String toString() {
		return "SeatOccupancy [id=" + id + ", journeyId=" + journeyId + ", jeepStopId=" + jeepStopId
				+ ", occupancyCount=" + occupancyCount + "]";
	}
	
}
