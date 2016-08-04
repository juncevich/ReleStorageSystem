package ru.relesystem.entities.storage;

import ru.relesystem.entities.Relay;
import ru.relesystem.entities.location.Station;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "stativ")
@NamedQueries({
        @NamedQuery(name = "Stativ.findById",
                query = "select s from Stativ s where s.id = :id"),
        @NamedQuery(name = "Stativ.findAllWithDetail",
                query = "select s from Stativ s "),
})
public class Stativ extends Storage {
    private Station station;
    private List<Relay> relaysOnStativ = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "STATION_ID")
    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }


    @OneToMany(mappedBy = "stativ")
    public List<Relay> getRelaysOnStativ() {
        return relaysOnStativ;
    }

    public void setRelaysOnStativ(List<Relay> relaysOnStativ) {
        this.relaysOnStativ = relaysOnStativ;
    }

}
