package ru.relesystem.entities;

import org.joda.time.DateTime;
import ru.relesystem.interfaces.Person;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * The class that is used for storage of equipment.
 */
@Entity
@Table(name = "RELAY")
@NamedQueries({
        @NamedQuery(name="Relay.findById",
                query="select r from Relay r"),
        @NamedQuery(name="Relay.findAllWithDetail",
                query="select r from Relay r ")
})
public class Relay implements Serializable {
    private Long id;
    private int version;
    /**
     * Contains the serial number.
     */
    private Integer number;
    /**
     * Contains type.
     */
    private String type;
    private int shelveNumber;
    private int shelvePosition;

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
     * Constructs an empty Relay, with empty parameters.
     */
    public Relay() {
    }

    /**
     * Construct Relay with specified parameters.
     *
     * @param number            the serial number
     * @param type              the type
     * @param shelveNumber      number of shelve on that located relay
     * @param shelvePosition    number of position relay on shelve
     * @param lastServiceDate   last service date
     * @param nextServiceDate   next service date
     * @param manufactureDate   manufacture date
     * @param responsiblePerson responsible person
     */
    public Relay(Integer number, String type, int shelveNumber,
                 int shelvePosition, Date lastServiceDate,
                 Date nextServiceDate, Date manufactureDate,
                 Person responsiblePerson) {
        this.number = number;
        this.type = type;
        this.shelveNumber = shelveNumber;
        this.shelvePosition = shelvePosition;
        this.lastServiceDate = lastServiceDate;
        this.nextServiceDate = nextServiceDate;
        this.manufactureDate = manufactureDate;
        this.responsiblePerson = responsiblePerson;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    /**
     * Returns the serial number.
     *
     * @return number  number, that consists of nine characters.
     */
    @Column(name = "SERIAL_NUMBER")
    public Integer getNumber() {
        return number;
    }

    /**
     * @param number number consists of nine characters.
     */
    public void setNumber(Integer number) {
        this.number = number;
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

    /**
     * Set the type corresponding to this user.
     *
     * @param type corresponding to this user.
     */
    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "SHELVE_NUMBER")
    public int getShelveNumber() {
        return this.shelveNumber;
    }

    public void setShelveNumber(int shelveNumber) {
        this.shelveNumber = shelveNumber;
    }

    @Column(name = "SHELVE_POSITION")
    public int getShelvePosition() {
        return shelvePosition;
    }

    public void setShelvePosition(int shelvePosition) {
        this.shelvePosition = shelvePosition;
    }

    /**
     * Returns the lastServiceDate corresponding to this user.
     *
     * @return the lastServiceDate corresponding to this user.
     */
    @Column(name = "SERVICE_DATE")
    @Temporal(TemporalType.DATE)
    public Date getLastServiceDate() {

        return this.lastServiceDate;
    }

    /**
     * Set the lastServiceDate corresponding to this user.
     *
     * @param lastServiceDate corresponding to this user.
     */
    public void setLastServiceDate(Date lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }

    /**
     * Returns the nextServiceDate corresponding to this user.
     *
     * @return the nextServiceDate corresponding to this user.
     */
    @Column(name = "NEXT_SERVICE_DATE")
    @Temporal(TemporalType.DATE)
    public Date getNextServiceDate() {

        return this.nextServiceDate;
    }

    /**
     * Set the nextServiceDate corresponding to this user.
     *
     * @param nextServiceDate corresponding to this user.
     */
    public void setNextServiceDate(Date nextServiceDate) {
        this.nextServiceDate = nextServiceDate;
    }

    /**
     * Returns the manufactureDate corresponding to this user.
     *
     * @return the manufactureDate corresponding to this user.
     */
    @Column(name = "MANUFACTURE_DATE")
    @Temporal(TemporalType.DATE)
    public Date getManufactureDate() {
        return manufactureDate;
    }

    /**
     * Set the manufactureDate corresponding to this user.
     *
     * @param manufactureDate corresponding to this user.
     */
    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    /**
     * Returns the responsiblePerson corresponding to this user.
     * @return the responsiblePerson corresponding to this user.
     */

//    public Person getResponsiblePerson() {
//        return responsiblePerson;
//    }
//    /**
//     * Set the responsiblePerson corresponding to this user.
//     * @param responsiblePerson  corresponding to this user.
//     */
//    public void setResponsiblePerson(Person responsiblePerson) {
//        this.responsiblePerson = responsiblePerson;
//    }
}
