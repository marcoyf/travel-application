/**
 * 
 */
package br.tec.marco.travelapplication.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.tec.marco.travelapplication.controllers.TravelDto;
import br.tec.marco.travelapplication.model.Travel;
import br.tec.marco.travelapplication.repository.TravelRepository;

/**
 * @author marcoyf
 *
 */
@Controller
public class MVCController {
	
	@Autowired
	private TravelRepository travelRepository;

	@RequestMapping("/mvc/all-travels")
	public String indexView(Model model) {
		model.addAttribute("list", travelRepository.findAll());
		return "allTravels";
	}
	
	@PostMapping("/mvc/travel")
	public String travelSubmit(@ModelAttribute TravelDto travelDto, Model model) {
		travelRepository.save(new Travel(travelDto.getUserId(), 
				travelDto.getSource(), travelDto.getDestination()));
		model.addAttribute("list", travelRepository.findAll());
		return "allTravels";
	}
	
	@GetMapping("/mvc/createTravel")
	public String travelForm(Model model) {
		model.addAttribute("travelDto", new TravelDto());
		return "create";
	}
}
