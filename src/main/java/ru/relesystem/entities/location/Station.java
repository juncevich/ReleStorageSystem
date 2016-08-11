package ru.relesystem.entities.location;

import ru.relesystem.entities.storage.Stativ;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "STATION")
@NamedQueries({
        @NamedQuery(name = "Station.findById",
                query = "select s from Station s where s.id = :id"),
        @NamedQuery(name = "Station.findAllWithDetail",
                query = "select s from Station s "),
})
public class Station extends Location {

    private String stationName;
    List<Stativ> storageList = new ArrayList<>();

    public Station() {
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

    public void addStativ(Stativ stativ) {
        stativ.setStation(this);
        getStorageList().add(stativ);
    }

    public void removeStativ(Stativ stativ) {
        getStorageList().remove(stativ);
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationName='" + stationName + '\'' +
                '}';
    }
}
