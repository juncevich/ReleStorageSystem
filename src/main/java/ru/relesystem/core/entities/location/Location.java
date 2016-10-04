package ru.relesystem.core.entities.location;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "LOCATIONS")
class Location {

    private int id;

    private int version;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    public int getId() {

        return id;
    }

    public void setId(int id) {

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

}
