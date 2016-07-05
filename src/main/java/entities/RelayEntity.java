package entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by alex on 06.07.16.
 */
@Entity
@Table(name = "relay", schema = "releSystemDatabase", catalog = "releSystemDatabase")
public class RelayEntity {
    private int id;
    private int serialNumber;
    private String fkType;
    private String fkUnit;
    private String fkStation;
    private Date manufactureDate;
    private Date lastService;
    private Date nextService;
    private String responible;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "serial_number")
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Basic
    @Column(name = "fk_type")
    public String getFkType() {
        return fkType;
    }

    public void setFkType(String fkType) {
        this.fkType = fkType;
    }

    @Basic
    @Column(name = "fk_unit")
    public String getFkUnit() {
        return fkUnit;
    }

    public void setFkUnit(String fkUnit) {
        this.fkUnit = fkUnit;
    }

    @Basic
    @Column(name = "fk_station")
    public String getFkStation() {
        return fkStation;
    }

    public void setFkStation(String fkStation) {
        this.fkStation = fkStation;
    }

    @Basic
    @Column(name = "manufacture_date")
    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Basic
    @Column(name = "last_service")
    public Date getLastService() {
        return lastService;
    }

    public void setLastService(Date lastService) {
        this.lastService = lastService;
    }

    @Basic
    @Column(name = "next_service")
    public Date getNextService() {
        return nextService;
    }

    public void setNextService(Date nextService) {
        this.nextService = nextService;
    }

    @Basic
    @Column(name = "responible")
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

        RelayEntity that = (RelayEntity) o;

        if (id != that.id) return false;
        if (serialNumber != that.serialNumber) return false;
        if (fkType != null ? !fkType.equals(that.fkType) : that.fkType != null) return false;
        if (fkUnit != null ? !fkUnit.equals(that.fkUnit) : that.fkUnit != null) return false;
        if (fkStation != null ? !fkStation.equals(that.fkStation) : that.fkStation != null) return false;
        if (manufactureDate != null ? !manufactureDate.equals(that.manufactureDate) : that.manufactureDate != null)
            return false;
        if (lastService != null ? !lastService.equals(that.lastService) : that.lastService != null) return false;
        if (nextService != null ? !nextService.equals(that.nextService) : that.nextService != null) return false;
        if (responible != null ? !responible.equals(that.responible) : that.responible != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + serialNumber;
        result = 31 * result + (fkType != null ? fkType.hashCode() : 0);
        result = 31 * result + (fkUnit != null ? fkUnit.hashCode() : 0);
        result = 31 * result + (fkStation != null ? fkStation.hashCode() : 0);
        result = 31 * result + (manufactureDate != null ? manufactureDate.hashCode() : 0);
        result = 31 * result + (lastService != null ? lastService.hashCode() : 0);
        result = 31 * result + (nextService != null ? nextService.hashCode() : 0);
        result = 31 * result + (responible != null ? responible.hashCode() : 0);
        return result;
    }
}
