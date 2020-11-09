/**
 * 
 */
package br.tec.marco.travelapplication.controllers;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

/**
 * @author marcoyf
 *
 */
@RestController
public class ReactiveController {

	private final ReactiveTravelRepository travelRepository;

	/**
	 * @param travelRepository
	 */
	@Autowired
	public ReactiveController(ReactiveTravelRepository travelRepository) {
		super();
		this.travelRepository = travelRepository;
	}
	
	@GetMapping("/reactive/travel/{userId}")
	public Mono<List<TravelDto>> getTravels(@PathVariable final String userId) {
		return travelRepository.getTravels(userId);
	}
	
	@PostMapping(value = "/reactive/travel", consumes = MediaType.APPLICATION_JSON)
	public Mono<TravelDto> addTravel(@RequestBody TravelDto travel) {
		return travelRepository.addTravel(travel);
	}
	
	
}
