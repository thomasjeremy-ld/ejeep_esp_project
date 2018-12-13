package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.SeatOccupancy;
import app.repositories.EjeepStopRepository;
import app.repositories.JourneyRepository;
import app.repositories.SeatOccupancyRepository;
import app.repositories.SeatOccupancyRepository;

@Component
public class SeatOccupancyComponent {
	
	@Autowired
	SeatOccupancyRepository repo;
	@Autowired
	JourneyRepository repoJourney;
	@Autowired
	EjeepStopRepository repoEjeepStop;
	
	public SeatOccupancy createSeatOccupancy(Long journeyId, Long jeepStopId, Integer occupancyCount)
	{
		SeatOccupancy s = new SeatOccupancy();
		
			s.setJourneyId(journeyId);
			s.setJeepStopId(jeepStopId);
			s.setOccupancyCount(occupancyCount);
	
		try
		{		
			repo.save(s);
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return s;
	}
	
	public SeatOccupancy editSeatOccupancy(Long seatOccupancyId, Long journeyId, Long jeepStopId, Integer occupancyCount)
	{
		SeatOccupancy s = repo.findById(seatOccupancyId);
		try 
		{
			if (journeyId != null)
				s.setJourneyId(journeyId);
			
			if (jeepStopId != null)
				s.setJeepStopId(jeepStopId);
			
			if (occupancyCount != null)
				s.setOccupancyCount(occupancyCount);
			
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return repo.save(s);
	}
	
	public SeatOccupancy viewSeatOccupancy(Long seatOccupancyId){
		return repo.findById(seatOccupancyId);
	}
	
	public SeatOccupancy deleteSeatOccupancy(Long seatOccupancyId){
		SeatOccupancy s = repo.findById(seatOccupancyId);
		repo.delete(s);
		return s;
	}
}
