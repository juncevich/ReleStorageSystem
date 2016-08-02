package ru.relesystem.entities.storage;

import ru.relesystem.entities.Relay;
import ru.relesystem.entities.location.Station;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "stativ")
public class Stativ extends Storage {
    private Station station;
    private Map<Byte, Relay> relaysOnStativ = new HashMap<>();

    @ManyToOne
    @JoinColumn(name = "station_id")
    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }


    @OneToMany(mappedBy = "stativ")
    public Map<Byte, Relay> getRelaysOnStativ() {
        return relaysOnStativ;
    }

    public void setRelaysOnStativ(Map<Byte, Relay> relaysOnStativ) {
        this.relaysOnStativ = relaysOnStativ;
    }
}
