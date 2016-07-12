package ru.relesystem.entities;

import org.joda.time.DateTime;
import ru.relesystem.enums.Profession;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Worker implements Serializable{
    private int id;
    private int version;
    private long stuffId;
    private String firstName;
    private String secondName;
    private String thirdName;
    private Enum<Profession> post;
    private byte[] photo;
    private DateTime startWorking;
    private DateTime endWorking;


}
