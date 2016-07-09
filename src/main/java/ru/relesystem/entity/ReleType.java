package ru.relesystem.entity;

import javax.persistence.*;

/**
 * Created by alex on 09.07.16.
 */
@Entity
@Table(name = "rele_type", schema = "releSystemDatabase", catalog = "")
public class ReleType {
    private int id;
    private String name;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReleType releType = (ReleType) o;

        if (id != releType.id) return false;
        if (name != null ? !name.equals(releType.name) : releType.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
