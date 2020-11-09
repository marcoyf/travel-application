/**
 * 
 */
package br.tec.marco.travelapplication.websockets;

/**
 * @author marcoyf
 *
 */
public class TravelAddedNotification {
	
	private String name;
	
	/**
	 * 
	 */
	public TravelAddedNotification() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public TravelAddedNotification(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
