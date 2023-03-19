/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Mar 16, 2023
 */
package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
//import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
@Entity
public class Albums {
	@Id
	@GeneratedValue
	private long albumId;
	private String name;
	private String artist;
	private double length;
	@Autowired
	private Producers producer;
	@Autowired
	private Awards award;
	
	
	/**
	 * 
	 */
	public Albums() {
		super();
		setArtist("The Beatles");
	}
}
