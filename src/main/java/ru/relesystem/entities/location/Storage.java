package ru.relesystem.entities.location;

import ru.relesystem.entities.Relay;

import javax.persistence.MappedSuperclass;
import java.util.Map;

@MappedSuperclass
public class Storage {
    private int id;
    private int version;
    Map<Byte,Relay> relayList;
    private Location location;

}
