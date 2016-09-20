package ru.relesystem.entities;

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
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import ru.relesystem.entities.storage.Stativ;

/**
 * The class that is used for storage of equipment.
 */
@Entity
@Table(name = "RELAY")
@NamedQueries({@NamedQuery(name = "Relay.findAll", query = "select r from Relay r"),
		@NamedQuery(name = "Relay.findById", query = "select r from Relay r where r.id = :id"),
		@NamedQuery(name = "Relay.findBySerialNumber", query = "select r from Relay r where r.number = :number"),
		@NamedQuery(name = "Relay.findByStativNumber", query = "select r from Relay r where r.stativ.num = :stativNumber"),
		@NamedQuery(name = "Relay.findAllWithDetail", query = "select r from Relay r ")})
public class Relay implements Serializable {

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
	private Integer number;
	/**
	 * Contains type.
	 */
	private String type;

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
	private Stativ stativ;

	public Relay() {
	}

	@Override
	public String toString() {
		return "Relay - Id: " + id + ", version " + version + ", Type: " + type + ", number " + number
				+ ",shelve position: " + shelvePosition + ", manufacture date: " + manufactureDate
				+ ", last service date: " + lastServiceDate + ", next service date: " + nextServiceDate + ", stativ: ";

	}

	@ManyToOne
	@JoinColumn(name = "STATIV_ID")
	public Stativ getStativ() {
		return stativ;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public Long getId() {
		return id;
	}

	@Version
	@Column(name = "VERSION")
	public Integer getVersion() {
		return version;
	}

	/**
	 * Returns the serial number.
	 *
	 * @return number number, that consists of nine characters.
	 */
	@Column(name = "SERIAL_NUMBER")
	public Integer getNumber() {
		return number;
	}

	/**
	 * Returns the type corresponding to this user.
	 *
	 * @return the type corresponding to this user.
	 */
	@Column(name = "TYPE_ID")
	public String getType() {
		return type;
	}

	@Column(name = "SHELVE_POSITION")
	public Integer getShelvePosition() {
		return shelvePosition;
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
	 * Returns the responsiblePerson corresponding to this user.
	 *
	 * @return the responsiblePerson corresponding to this user.
	 */
	@Column(name = "RESPONSIBLE_PERSON")
	public String getResponsiblePerson() {
		return responsiblePerson;
	}

	public void setStativ(Stativ stativ) {
		this.stativ = stativ;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * @param number
	 *            number consists of nine characters.
	 */
	public void setNumber(Integer number) {
		this.number = number;
	}

	/**
	 * Set the type corresponding to this user.
	 *
	 * @param type
	 *            corresponding to this user.
	 */
	public void setType(String type) {
		this.type = type;
	}

	public void setShelvePosition(Integer shelvePosition) {
		this.shelvePosition = shelvePosition;
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
	 * Set the nextServiceDate corresponding to this user.
	 *
	 * @param nextServiceDate
	 *            corresponding to this user.
	 */
	public void setNextServiceDate(DateTime nextServiceDate) {
		this.nextServiceDate = nextServiceDate;
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
	 * Set the responsiblePerson corresponding to this user.
	 *
	 * @param responsiblePerson
	 *            corresponding to this user.
	 */
	public void setResponsiblePerson(String responsiblePerson) {
		this.responsiblePerson = responsiblePerson;
	}
}
