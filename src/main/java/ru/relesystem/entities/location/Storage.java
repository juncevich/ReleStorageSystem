package ru.relesystem.entities.location;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Storage {
    private int id;
    private int version;
    private Lgit adocation location;

}
