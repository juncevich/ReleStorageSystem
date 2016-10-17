package ru.relesystem.core.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import ru.relesystem.core.entities.location.Location;
import ru.relesystem.core.entities.relaytype.RelayType;
import ru.relesystem.core.entities.storage.Storage;

/**
 * The class that is used for storage of equipment.
 */
@Entity
@Table(name = "RELAYS")
@NamedQueries({@NamedQuery(name = "Relay.findAll", query = "select r from Relay r"),
		@NamedQuery(name = "Relay.findById", query = "select r from Relay r where r.id = :id"),
		@NamedQuery(name = "Relay.findBySerialNumber", query = "select r from Relay r where r.number = :number"),
		@NamedQuery(name = "Relay.findByStativNumber", query = "select r from Relay r where r.storage.id = :stativNumber"),
		@NamedQuery(name = "Relay.findByLocationId", query = "select r from Relay r where r.location.id = :locationId"),
		@NamedQuery(name = "Relay.findByResponsiblePerson", query = "select r from Relay r where r.responsiblePerson = :stationName"),
		@NamedQuery(name = "Relay.findAllWithDetail", query = "select r from Relay r ")})
public class Relay implements Serializable {

	private static final long serialVersionUID = 491033965929835071L;
	/**
	 * Relay id
	 */
	private Long id;

	/**
	 * Optimistic block
	 */
	private Integer version;

	/**
	 * Contains the serial number.
	 */
	private String number;

	/**
	 * Contains type.
	 */
	private RelayType type;

	/**
	 * Position on the shelve
	 */
	private Integer shelvePosition;

	/**
	 * Contains the date of the last service.
	 */
	private DateTime lastServiceDate;

	/**
	 * Contains the date of the next service.
	 */
	private DateTime nextServiceDate;

	/**
	 * Contains the date of manufacture.
	 */
	private DateTime manufactureDate;

	/**
	 * Contains responsible person for the relay.
	 */
	private String responsiblePerson;

	/**
	 *
	 */
	private Storage storage;

	/**
	 *
	 */
	private Location location;

	public Relay() {

	}

	@Override
	public String toString() {

		return "Relay - Id: " + id + ", version " + version + ", Type: " + type + ", number " + number
				+ ",shelve position: " + shelvePosition + ", manufacture date: " + manufactureDate
				+ ", last service date: " + lastServiceDate + ", next service date: " + nextServiceDate + ", stativ: ";

	}

	@ManyToOne
	@JoinColumn(name = "STORAGE_ID")
	public Storage getStorage() {

		return storage;
	}

	public void setStorage(Storage storage) {

		this.storage = storage;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public Long getId() {

		return id;
	}

	public void setId(Long id) {

		this.id = id;
	}

	@Version
	@Column(name = "VERSION")
	public Integer getVersion() {

		return version;
	}

	public void setVersion(Integer version) {

		this.version = version;
	}

	/**
	 * Returns the serial number.
	 *
	 * @return number number, that consists of nine characters.
	 */
	@Column(name = "SERIAL_NUMBER")
	public String getNumber() {

		return number;
	}

	/**
	 * @param number
	 *            number consists of nine characters.
	 */
	public void setNumber(String number) {

		this.number = number;
	}

	/**
	 * Returns the type corresponding to this user.
	 *
	 * @return the type corresponding to this user.
	 */
	@OneToOne
	@JoinColumn(name = "TYPE_ID")
	public RelayType getType() {

		return type;
	}

	/**
	 * Set the type corresponding to this user.
	 *
	 * @param type
	 *            corresponding to this user.
	 */
	public void setType(RelayType type) {

		this.type = type;
	}

	@Column(name = "SHELVE_POSITION")
	public Integer getShelvePosition() {

		return shelvePosition;
	}

	public void setShelvePosition(Integer shelvePosition) {

		this.shelvePosition = shelvePosition;
	}

	/**
	 * @return the {@link #location}
	 */
    @OneToOne
    @JoinColumn(name = "LOCATION_ID")
	public Location getLocation() {

		return location;
	}

	/**
	 * @param location
	 *            the {@link #location} to set
	 */
	public void setLocation(Location location) {

		this.location = location;
	}

	/**
	 * Returns the lastServiceDate corresponding to this user.
	 *
	 * @return the lastServiceDate corresponding to this user.
	 */
	@Column(name = "SERVICE_DATE")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	public DateTime getLastServiceDate() {

		return this.lastServiceDate;
	}

	/**
	 * Set the lastServiceDate corresponding to this user.
	 *
	 * @param lastServiceDate
	 *            corresponding to this user.
	 */
	public void setLastServiceDate(DateTime lastServiceDate) {

		this.lastServiceDate = lastServiceDate;
	}

	/**
	 * Returns the nextServiceDate corresponding to this user.
	 *
	 * @return the nextServiceDate corresponding to this user.
	 */
	@Column(name = "NEXT_SERVICE_DATE")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	public DateTime getNextServiceDate() {

		return this.nextServiceDate;
	}

	/**
	 * Set the nextServiceDate corresponding to this user.
	 *
	 * @param nextServiceDate
	 *            corresponding to this user.
	 */
	public void setNextServiceDate(DateTime nextServiceDate) {

		this.nextServiceDate = nextServiceDate;
	}

	/**
	 * Returns the manufactureDate corresponding to this user.
	 *
	 * @return the manufactureDate corresponding to this user.
	 */
	@Column(name = "MANUFACTURE_DATE")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	public DateTime getManufactureDate() {

		return manufactureDate;
	}

	/**
	 * Set the manufactureDate corresponding to this user.
	 *
	 * @param manufactureDate
	 *            corresponding to this user.
	 */
	public void setManufactureDate(DateTime manufactureDate) {

		this.manufactureDate = manufactureDate;
	}

	/**
	 * Returns the responsiblePerson corresponding to this user.
	 *
	 * @return the responsiblePerson corresponding to this user.
	 */
	@Column(name = "RESPONSIBLE_PERSON")
	public String getResponsiblePerson() {

		return responsiblePerson;
	}

	/**
	 * Set the responsiblePerson corresponding to this user.
	 *
	 * @param responsiblePerson
	 *            corresponding to this user.
	 */
	public void setResponsiblePerson(String responsiblePerson) {

		this.responsiblePerson = responsiblePerson;
	}
}
