package ru.relesystem.core.entities.storage;

import ru.relesystem.core.entities.Relay;
import ru.relesystem.core.entities.location.Station;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "STATIVS")
@NamedQueries({@NamedQuery(name = "Stativ.findById", query = "select s from Stativ s where s.id = :id"),
        @NamedQuery(name = "Stativ.findAllWithDetail", query = "select s from Stativ s ")})
public class Stativ extends Storage {

    private Integer Num;

    private Station station;

    private List<Relay> relaysOnStativ = new ArrayList<>();

    public Stativ() {

    }

    @Column(name = "NUM")
    public Integer getNum() {

        return Num;
    }

    public void setNum(Integer num) {

        Num = num;
    }

    @ManyToOne
    @JoinColumn(name = "STATION_ID")
    public Station getStation() {

        return station;
    }

    public void setStation(Station station) {

        this.station = station;
    }

    @OneToMany(mappedBy = "storage")
    public List<Relay> getRelaysOnStativ() {

        return relaysOnStativ;
    }

    public void setRelaysOnStativ(List<Relay> relaysOnStativ) {

        this.relaysOnStativ = relaysOnStativ;
    }

    public void addRele(Relay relay) {

        relay.setStorage(this);
        getRelaysOnStativ().add(relay);
    }

    public void removeRele(Relay relay) {

        getRelaysOnStativ().remove(relay);
    }

}
