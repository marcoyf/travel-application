/**
 * 
 */
package br.tec.marco.travelapplication.jparest;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.tec.marco.travelapplication.model.Travel;

/**
 * @author marcoyf
 *
 */
@RepositoryRestResource(collectionResourceRel = "travel", path = "travel")
public interface TravelRestRepository extends PagingAndSortingRepository<Travel, Long> {
	
	@Query("select t from Travel t where t.destination =: destination")
	List<Travel> findByDestination(@Param("destination") String destination);
}
