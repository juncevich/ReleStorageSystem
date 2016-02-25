package entities;

import interfaces.Location;
import interfaces.Person;

import java.util.Date;

/**
 * The class that is used for storage of equipment.
 */
public class Rele {
    /**
     * Contains the serial number.
     */
    private Integer number;
    /**
     * Contains type.
     */
    private String type;
    /**
     * Contains location.
     */
    private Location location;
    /**
     * Contains the date of the last service.
     */
    private Date lastServiceDate;
    /**
     * Contains the date of the next service.
     */
    private Date nextServiceDate;
    /**
     * Contains the date of manufacture.
     */
    private Date manufactureDate;
    /**
     * Contains responsible person for the relay.
     */
    private Person responsiblePerson;

    /**
     * Constructs an empty Rele, with empty parameters.
     */
    public Rele() {
    }

    /**
     * Construct Rele with specified parameters.
     * @param number the serial number
     * @param type the type
     * @param location the location of rele
     * @param lastServiceDate last service date
     * @param nextServiceDate next service date
     * @param manufactureDate manufacture date
     * @param responsiblePerson responsible person
     */
    public Rele(Integer number, String type, Location location,
                Date lastServiceDate, Date nextServiceDate,
                Date manufactureDate, Person responsiblePerson) {
        this.number = number;
        this.type = type;
        this.location = location;
        this.lastServiceDate = lastServiceDate;
        this.nextServiceDate = nextServiceDate;
        this.manufactureDate = manufactureDate;
        this.responsiblePerson = responsiblePerson;
    }

    /**
     * Returns the serial number.
     * @return number  number, that consists of nine characters.
     */
    public Integer getNumber() {
        return number;
    }

    /**
     *
     * @param number  number consists of nine characters.
     */
    public void setNumber(Integer number) {
        this.number = number;
    }
    /**
     * Returns the type corresponding to this user.
     * @return the type corresponding to this user.
     */
    public String getType() {
        return type;
    }
    /**
     * Set the type corresponding to this user.
     * @param type  corresponding to this user.
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * Returns the location corresponding to this user.
     * @return the location corresponding to this user.
     */
    public Location getLocation() {
        return location;
    }
    /**
     * Set the location corresponding to this user.
     * @param location  corresponding to this user.
     */
    public void setLocation(Location location) {
        this.location = location;
    }
    /**
     * Returns the lastServiceDate corresponding to this user.
     * @return the lastServiceDate corresponding to this user.
     */
    public Date getLastServiceDate() {
        return lastServiceDate;
    }
    /**
     * Set the lastServiceDate corresponding to this user.
     * @param lastServiceDate  corresponding to this user.
     */
    public void setLastServiceDate(Date lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }
    /**
     * Returns the nextServiceDate corresponding to this user.
     * @return the nextServiceDate corresponding to this user.
     */
    public Date getNextServiceDate() {
        return nextServiceDate;
    }
    /**
     * Set the nextServiceDate corresponding to this user.
     * @param nextServiceDate  corresponding to this user.
     */
    public void setNextServiceDate(Date nextServiceDate) {
        this.nextServiceDate = nextServiceDate;
    }
    /**
     * Returns the manufactureDate corresponding to this user.
     * @return the manufactureDate corresponding to this user.
     */
    public Date getManufactureDate() {
        return manufactureDate;
    }
    /**
     * Set the manufactureDate corresponding to this user.
     * @param manufactureDate  corresponding to this user.
     */
    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    /**
     * Returns the responsiblePerson corresponding to this user.
     * @return the responsiblePerson corresponding to this user.
     */
    public Person getResponsiblePerson() {
        return responsiblePerson;
    }
    /**
     * Set the responsiblePerson corresponding to this user.
     * @param responsiblePerson  corresponding to this user.
     */
    public void setResponsiblePerson(Person responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }
}
