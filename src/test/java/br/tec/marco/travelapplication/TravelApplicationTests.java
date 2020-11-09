package br.tec.marco.travelapplication;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.tec.marco.travelapplication.booking.BookingService;
import br.tec.marco.travelapplication.model.Travel;

@RunWith(SpringRunner.class)
@SpringBootTest
class TravelApplicationTests {
	
	@Autowired
	BookingService bookingService;

	@Test
	void shouldBookATravel() {
		bookingService.book(new Travel("myuser", "LONDON", "PARIS"));
	}

}
