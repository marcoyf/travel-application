/**
 * 
 */
package br.tec.marco.travelapplication.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author marcoyf
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ReactiveTravelRepositoryTest {

	@Test
	public void shouldCreateAndRetrieveTravel() {
		
		RestTemplate restTemplate = new RestTemplate();
		TravelDto travelDto = new TravelDto(UUID.randomUUID().toString(), "SRC", "DST");
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<TravelDto> entity = new HttpEntity<TravelDto>(travelDto, headers);
		
		ResponseEntity<TravelDto> response = restTemplate
				.postForEntity("http://localhost:8080/reactive/travel", entity, TravelDto.class);
		
		assertThat(response.getStatusCode().value()).isEqualTo(200);
		assertThat(response.getBody()).isNotNull();
		
		List<TravelDto> getResponse = restTemplate.exchange(
				"http://localhost:8080/reactive/travel/" + response.getBody().getUserId(),
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<TravelDto>>() {
				}).getBody();
				
		assertThat(response.getStatusCode().value()).isEqualTo(200);
		assertThat(getResponse.size()).isGreaterThan(0);
	}

}
