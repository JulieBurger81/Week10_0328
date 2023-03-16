/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Mar 16, 2023
 */
package dmacc.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Albums {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String artist;
	private double length;
	/**
	 * 
	 */
	public Albums() {
		super();
		setArtist("The Beatles");
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
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
	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}
	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return "Albums [id=" + id + ", name=" + name + ", artist=" + artist + ", length=" + length + "]";
	}
	
}
