/**
 * 
 */
package br.tec.marco.travelapplication.hystrix;

import java.net.URI;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author marcoyf
 *
 */
@Component
public class TravelDestinationDetails {

	private final RestTemplate restTemplate;

	/**
	 * @param restTemplate
	 */
	public TravelDestinationDetails(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	
	@HystrixCommand(fallbackMethod = "reliable")
	public String getInfoAboutCity(String cityName) {
		URI uri = URI.create("https://restcountries.eu/rest/v2/capital/" + cityName);
		
		return this.restTemplate.getForObject(uri, String.class);
	}
	
	public String reliable(String cityName) {
		return "Info about city: " + cityName + " is not currently available";
	}
	
}
