/**
 * 
 */
package br.tec.marco.travelapplication.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.tec.marco.travelapplication.repository.TravelRepository;

/**
 * @author marcoyf
 *
 */
@RestController
public class SecretController {
	
	@Autowired
	private TravelRepository travelRespository;

	@RequestMapping("/secret")
	public Long numberOfTravels() {
		return travelRespository.count();
	}
}
