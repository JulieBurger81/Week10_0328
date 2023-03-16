/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Mar 16, 2023
 */
package dmacc.beans;

import jakarta.persistence.Embeddable;

@Embeddable
public class Producers {
	private String company;
	private String headquarters;
	private int yearFounded;
	/**
	 * 
	 */
	public Producers() {
		super();
	}
	/**
	 * @param company
	 * @param headquarters
	 * @param yearFounded
	 */
	public Producers(String company, String headquarters, int yearFounded) {
		super();
		this.company = company;
		this.headquarters = headquarters;
		this.yearFounded = yearFounded;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the headquarters
	 */
	public String getHeadquarters() {
		return headquarters;
	}
	/**
	 * @param headquarters the headquarters to set
	 */
	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}
	/**
	 * @return the yearFounded
	 */
	public int getYearFounded() {
		return yearFounded;
	}
	/**
	 * @param yearFounded the yearFounded to set
	 */
	public void setYearFounded(int yearFounded) {
		this.yearFounded = yearFounded;
	}
	@Override
	public String toString() {
		return "Producers [company=" + company + ", headquarters=" + headquarters + ", yearFounded=" + yearFounded
				+ "]";
	}
}
