/**
 * 
 */
package br.tec.marco.travelapplication.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.tec.marco.travelapplication.model.Travel;

/**
 * @author marcoyf
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TravelRepositoryIntegrationTest {

	@Autowired
	TravelRepository travelRepository;
	
	@Test
	public void shoudSaveTravelAndRetrieveItByUserId() {
		String userId = "marco";
		Travel travel = new Travel(userId, "LONDON", "PARIS");
		
		travelRepository.save(travel);
		List<Travel> travels = travelRepository.findByUserId(userId);
		
		assertThat(travels.get(0).getDestination()).isEqualTo("PARIS");
		assertThat(travels.get(0).getSource()).isEqualTo("LONDON");
		
	}
	
	@Test
	public void shouldRetrieveAllTravelsThatHaveBarcelonaAsDestination() {
		List<Travel> travels = Arrays.asList(
				new Travel(UUID.randomUUID().toString(), "LONDON", "BARCELONA"), 
				new Travel(UUID.randomUUID().toString(), "BARCELONA", "LONDON"), 
				new Travel(UUID.randomUUID().toString(), "MADRID", "BARCELONA"));
		
		travelRepository.saveAll(travels);
		List<Travel> foundTravels = travelRepository.findByDestination("BARCELONA");
		
		assertThat(foundTravels.size()).isEqualTo(2);
	}
}
