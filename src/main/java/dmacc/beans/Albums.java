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
	/**
	 * @param name
	 * @param artist
	 * @param length
	 */
	public Albums(String name, String artist, double length) {
		super();
		setName(name);
		setArtist(artist);
		setLength(length);
	}
	/**
	 * @return the albumId
	 */
	public long getAlbumId() {
		return albumId;
	}
	/**
	 * @param albumId the albumId to set
	 */
	public void setAlbumId(long albumId) {
		this.albumId = albumId;
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
	/**
	 * @return the producer
	 */
	public Producers getProducer() {
		return producer;
	}
	/**
	 * @param producer the producer to set
	 */
	public void setProducer(Producers producer) {
		this.producer = producer;
	}
	/**
	 * @return the award
	 */
	public Awards getAward() {
		return award;
	}
	/**
	 * @param award the award to set
	 */
	public void setAward(Awards award) {
		this.award = award;
	}
	@Override
	public String toString() {
		return "Albums [albumId=" + albumId + ", name=" + name + ", artist=" + artist + ", length=" + length
				+ ", producer=" + producer + "]";
	}
}
