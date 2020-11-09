/**
 * 
 */
package br.tec.marco.travelapplication.configuration;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author marcoyf
 *
 */
@Component
@ConfigurationProperties(prefix = "travel-config")
public class BookingServiceSettings {
	
	private List<String> supportedDestinations;

	/**
	 * @return the supportedDestinations
	 */
	public List<String> getSupportedDestinations() {
		return supportedDestinations;
	}

	/**
	 * @param supportedDestinations the supportedDestinations to set
	 */
	public void setSupportedDestinations(List<String> supportedDestinations) {
		this.supportedDestinations = supportedDestinations;
	}
	

}
