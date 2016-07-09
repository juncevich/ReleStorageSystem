package ru.relesystem.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by alex on 09.07.16.
 */
@Entity
public class Relay {
    private int id;
    private int serialNumber;
    private Date manufactureDate;
    private Date lastService;
    private Date nextService;
    private String responible;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "serial_number", nullable = false)
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Basic
    @Column(name = "manufacture_date", nullable = false)
    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Basic
    @Column(name = "last_service", nullable = false)
    public Date getLastService() {
        return lastService;
    }

    public void setLastService(Date lastService) {
        this.lastService = lastService;
    }

    @Basic
    @Column(name = "next_service", nullable = false)
    public Date getNextService() {
        return nextService;
    }

    public void setNextService(Date nextService) {
        this.nextService = nextService;
    }

    @Basic
    @Column(name = "responible", nullable = false, length = 45)
    public String getResponible() {
        return responible;
    }

    public void setResponible(String responible) {
        this.responible = responible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Relay relay = (Relay) o;

        if (id != relay.id) return false;
        if (serialNumber != relay.serialNumber) return false;
        if (manufactureDate != null ? !manufactureDate.equals(relay.manufactureDate) : relay.manufactureDate != null)
            return false;
        if (lastService != null ? !lastService.equals(relay.lastService) : relay.lastService != null) return false;
        if (nextService != null ? !nextService.equals(relay.nextService) : relay.nextService != null) return false;
        if (responible != null ? !responible.equals(relay.responible) : relay.responible != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + serialNumber;
        result = 31 * result + (manufactureDate != null ? manufactureDate.hashCode() : 0);
        result = 31 * result + (lastService != null ? lastService.hashCode() : 0);
        result = 31 * result + (nextService != null ? nextService.hashCode() : 0);
        result = 31 * result + (responible != null ? responible.hashCode() : 0);
        return result;
    }
}
