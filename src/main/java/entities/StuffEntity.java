package entities;

import javax.persistence.*;

/**
 * Created by alex on 06.07.16.
 */
@Entity
@Table(name = "stuff", schema = "releSystemDatabase", catalog = "releSystemDatabase")
public class StuffEntity {
    private int id;
    private int stuffNumber;
    private String name;
    private String secondName;
    private String lastName;
    private String fkCategory;
    private String fkUnit;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "stuff_number")
    public int getStuffNumber() {
        return stuffNumber;
    }

    public void setStuffNumber(int stuffNumber) {
        this.stuffNumber = stuffNumber;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "second_name")
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "fk_category")
    public String getFkCategory() {
        return fkCategory;
    }

    public void setFkCategory(String fkCategory) {
        this.fkCategory = fkCategory;
    }

    @Basic
    @Column(name = "fk_unit")
    public String getFkUnit() {
        return fkUnit;
    }

    public void setFkUnit(String fkUnit) {
        this.fkUnit = fkUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StuffEntity that = (StuffEntity) o;

        if (id != that.id) return false;
        if (stuffNumber != that.stuffNumber) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (secondName != null ? !secondName.equals(that.secondName) : that.secondName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (fkCategory != null ? !fkCategory.equals(that.fkCategory) : that.fkCategory != null) return false;
        if (fkUnit != null ? !fkUnit.equals(that.fkUnit) : that.fkUnit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + stuffNumber;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (fkCategory != null ? fkCategory.hashCode() : 0);
        result = 31 * result + (fkUnit != null ? fkUnit.hashCode() : 0);
        return result;
    }
}
