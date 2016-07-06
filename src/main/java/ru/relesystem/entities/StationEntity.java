package ru.relesystem.entities;

import javax.persistence.*;

/**
 * Created by alex on 06.07.16.
 */
@Entity
@Table(name = "station", schema = "releSystemDatabase", catalog = "releSystemDatabase")
public class StationEntity {
    private int id;
    private String stationName;
    private String fkUnit;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "station_name")
    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Basic
    @Column(name = "fk_unit")
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

        StationEntity that = (StationEntity) o;

        if (id != that.id) return false;
        if (stationName != null ? !stationName.equals(that.stationName) : that.stationName != null) return false;
        if (fkUnit != null ? !fkUnit.equals(that.fkUnit) : that.fkUnit != null) return false;

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
