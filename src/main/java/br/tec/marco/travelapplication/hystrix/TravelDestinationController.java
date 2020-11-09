/**
 * 
 */
package br.tec.marco.travelapplication.hystrix;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author marcoyf
 *
 */
@RestController
public class TravelDestinationController {
	
	@Autowired
	private TravelDestinationDetails travelDestinationDetails;
	
	@RequestMapping(value = "/travel/destination-details/{city}", produces = MediaType.APPLICATION_JSON)
	public String getInfoAboutDestination(@PathVariable String city) {
		return travelDestinationDetails.getInfoAboutCity(city);
	}

}
