package ru.relesystem.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by alex on 09.07.16.
 */
@Entity
public class Station {
    private int id;
    private String stationName;
    private String fkUnit;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "station_name", nullable = false, length = 45)
    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Basic
    @Column(name = "fk_unit", nullable = false, length = 45)
    public String getFkUnit() {
        return fkUnit;
    }

    public void setFkUnit(String fkUnit) {
        this.fkUnit = fkUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Station station = (Station) o;

        if (id != station.id) return false;
        if (stationName != null ? !stationName.equals(station.stationName) : station.stationName != null) return false;
        if (fkUnit != null ? !fkUnit.equals(station.fkUnit) : station.fkUnit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (stationName != null ? stationName.hashCode() : 0);
        result = 31 * result + (fkUnit != null ? fkUnit.hashCode() : 0);
        return result;
    }
}
