/**
 * 
 */
package br.tec.marco.travelapplication.controllers;

/**
 * @author marcoyf
 *
 */
public class TravelDto {
	
	private String userId;
	private String source;
	private String destination;

	/**
	 * 
	 */
	public TravelDto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param userId
	 * @param source
	 * @param destination
	 */
	public TravelDto(String userId, String source, String destination) {
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

	@Override
	public String toString() {
		return "TravelDto [userId=" + userId + ", source=" + source + ", destination=" + destination + "]";
	}
	
}
