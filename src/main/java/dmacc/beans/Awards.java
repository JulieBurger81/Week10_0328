/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Mar 16, 2023
 */
package dmacc.beans;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class Awards {
	public String title;
	public int yearAwarded;
}
