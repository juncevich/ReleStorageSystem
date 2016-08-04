package ru.relesystem.entities;

import ru.relesystem.entities.storage.Stativ;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * The class that is used for storage of equipment.
 */
@Entity
@Table(name = "relay")
@NamedQueries({
        @NamedQuery(name = "Relay.findById",
                query = "select r from Relay r where r.id = :id"),
        @NamedQuery(name = "Relay.findAllWithDetail",
                query = "select r from Relay r "),
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
    private String responsiblePerson;
    private Stativ stativ;

    public Relay() {
    }

    @ManyToOne
    @JoinColumn(name = "STATIV_ID")
    public Stativ getStativ() {
        return stativ;
    }

    public void setStativ(Stativ stativ) {
        this.stativ = stativ;
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
     * @param responsiblePerson corresponding to this user.
     */
    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    @Override
    public String toString() {
        return "Relay - Id: " + id + ", version " + version + ", Type: " + type
                + ", number " + number + ",shelve position: " + shelvePosition + ", manufacture date: " + manufactureDate
                + ", last service date: " + lastServiceDate + ", next service date: "
                + nextServiceDate + ", stativ: " ;

    }
}
