/**
 * 
 */
package br.tec.marco.travelapplication.websockets;

/**
 * @author marcoyf
 *
 */
public class HelloMessage {
	
	private String content;

	/**
	 * 
	 */
	public HelloMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param content
	 */
	public HelloMessage(String content) {
		super();
		this.content = content;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

}
