package ru.relesystem.entities.storage;

import ru.relesystem.entities.Relay;
import ru.relesystem.entities.location.Station;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "stativ")
@NamedQueries({
        @NamedQuery(name = "Stativ.findById",
                query = "select s from Stativ s where s.id = :id"),
        @NamedQuery(name = "Stativ.findAllWithDetail",
                query = "select s from Stativ s "),
})
public class Stativ  {
    private Long id;
    private int version;
    private Integer Num;
    private Station station;
    private List<Relay> relaysOnStativ = new ArrayList<>();

    public Stativ() {
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


    @OneToMany(mappedBy = "stativ")
    public List<Relay> getRelaysOnStativ() {
        return relaysOnStativ;
    }

    public void setRelaysOnStativ(List<Relay> relaysOnStativ) {
        this.relaysOnStativ = relaysOnStativ;
    }

}
