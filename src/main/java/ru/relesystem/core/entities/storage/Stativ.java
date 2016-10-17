package ru.relesystem.core.entities.storage;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ru.relesystem.core.entities.Relay;
import ru.relesystem.core.entities.location.Location;
import ru.relesystem.core.entities.location.Station;

@Entity
@Table(name = "STATIVS")
@NamedQueries({@NamedQuery(name = "Stativ.findById", query = "select s from Stativ s where s.id = :id"),
        @NamedQuery(name = "Stativ.findAllWithDetail", query = "select s from Stativ s ")})
public class Stativ extends Storage {

    private Integer Num;

    private Location location;

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
    @JoinColumn(name = "LOCATION_ID")
    public Location getLocation() {

        return location;
    }

    public void setLocation(Location location) {

        this.location = location;
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
        relay.setLocation(this.location);
        getRelaysOnStativ().add(relay);
    }

    public void removeRele(Relay relay) {

        getRelaysOnStativ().remove(relay);
    }

}
