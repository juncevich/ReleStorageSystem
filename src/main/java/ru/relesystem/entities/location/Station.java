package ru.relesystem.entities.location;

import ru.relesystem.entities.storage.Stativ;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "station")
public class Station {

    private Long id;
    private int version;
    private String stationName;
    List<Stativ> storageList;

    public Station() {
    }

    @Id
    @GeneratedValue(strategy = AUTO)
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


    @OneToMany(mappedBy = "station")
    public List<Stativ> getStorageList() {
        return storageList;
    }

    public void setStorageList(List<Stativ> storageList) {
        this.storageList = storageList;
    }
    @Column(name = "STATION_NAME")
    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationName='" + stationName + '\'' +
                '}';
    }
}
