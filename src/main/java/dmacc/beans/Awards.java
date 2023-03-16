/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Mar 16, 2023
 */
package dmacc.beans;

import jakarta.persistence.Embeddable;

@Embeddable
public class Awards {
	public String title;
	public int yearAwarded;
	/**
	 * 
	 */
	public Awards() {
		super();
	}
	/**
	 * @param title
	 * @param yearAwarded
	 */
	public Awards(String title, int yearAwarded) {
		super();
		setTitle(title);
		setYearAwarded(yearAwarded);
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the yearAwarded
	 */
	public int getYearAwarded() {
		return yearAwarded;
	}
	/**
	 * @param yearAwarded the yearAwarded to set
	 */
	public void setYearAwarded(int yearAwarded) {
		this.yearAwarded = yearAwarded;
	}
	@Override
	public String toString() {
		return "Awards [title=" + title + ", yearAwarded=" + yearAwarded + "]";
	}
}
