package ru.relesystem.core.entities.location;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "LOCATIONS")
public class Location {

	private int id;

	/**
	 * @return the {@link #locationName}
	 */
	public String getLocationName() {

		return locationName;
	}

	/**
	 * @param locationName
	 *            the {@link #locationName} to set
	 */
	public void setLocationName(String locationName) {

		this.locationName = locationName;
	}

	private String locationName;
	private int version;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id = id;
	}

	@Version
	@Column(name = "VERSION")
	public int getVersion() {

		return version;
	}

	public void setVersion(int version) {

		this.version = version;
	}

}
