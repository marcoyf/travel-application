/**
 * 
 */
package br.tec.marco.travelapplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author marcoyf
 *
 */
@Entity
public class Travel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String userId;
	private String source;
	private String destination;
	/**
	 * 
	 */
	public Travel() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param userId
	 * @param source
	 * @param destination
	 */
	public Travel(String userId, String source, String destination) {
		super();
		this.userId = userId;
		this.source = source;
		this.destination = destination;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Travel [id=" + id + ", userId=" + userId + ", source=" + source + ", destination=" + destination + "]";
	}
}
