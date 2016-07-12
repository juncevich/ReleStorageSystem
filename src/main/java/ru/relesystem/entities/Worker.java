package ru.relesystem.entities;

import org.joda.time.DateTime;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Worker extends Person implements Serializable{

    private DateTime startWorking;
    private DateTime endWorking;


}
