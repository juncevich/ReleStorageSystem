package ru.relesystem.entities.location;

import ru.relesystem.entities.storage.Stativ;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "station")
public class Station extends Location {
    private String stationName;
    List<Stativ> storageList;
    @OneToMany(mappedBy = "station")
    public List<Stativ> getStorageList() {
        return storageList;
    }

    public void setStorageList(List<Stativ> storageList) {
        this.storageList = storageList;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
}
