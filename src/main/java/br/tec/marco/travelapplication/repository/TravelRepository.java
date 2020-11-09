/**
 * 
 */
package br.tec.marco.travelapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.tec.marco.travelapplication.model.Travel;

/**
 * @author marcoyf
 *
 */
public interface TravelRepository extends CrudRepository<Travel, Long> {
	
	@Query("select t from Travel t where t.userId=:userId")
	List<Travel> findByUserId(@Param("userId") String userId);
	
	@Query("select t from Travel t where t.destination=:destination")
	List<Travel> findByDestination(@Param("destination") String destination);

}
