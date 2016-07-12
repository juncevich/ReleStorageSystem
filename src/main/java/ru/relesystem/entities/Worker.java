package ru.relesystem.entities;

import org.joda.time.DateTime;

import javax.persistence.Entity;

@Entity
public class Worker extends Person{

    private DateTime startWorking;
    private DateTime endWorking;


}
