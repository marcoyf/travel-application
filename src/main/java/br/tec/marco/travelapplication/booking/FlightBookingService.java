/**
 * 
 */
package br.tec.marco.travelapplication.booking;


import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.tec.marco.travelapplication.configuration.BookingServiceSettings;
import br.tec.marco.travelapplication.model.Travel;

/**
 * @author marcoyf
 *
 */
@Component
public class FlightBookingService implements BookingService {
	
	static Logger logger = Logger.getLogger(FlightBookingService.class.getName());
	
	private final BookingServiceSettings bookingServiceSettings;
	
	@Autowired
	public FlightBookingService(BookingServiceSettings bookingServiceSettings) {
		this.bookingServiceSettings = bookingServiceSettings;
	}

	@Override
	public boolean book(Travel travel) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@PostConstruct
	public void init() {
		logger.info("inside init() method");
	}
	
	@PreDestroy
	public void cleanup() {
		logger.info("inside cleanup() method where it's possible to release some resources");
	}

}
