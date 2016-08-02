package ru.relesystem.entities.location;

import javax.persistence.MappedSuperclass;
import java.util.List;

@MappedSuperclass
public class Location {
    private int id;
    private int version;
    List<Storage> storageList;
}
