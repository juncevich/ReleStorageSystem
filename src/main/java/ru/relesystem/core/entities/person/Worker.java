package ru.relesystem.core.entities.person;

import org.joda.time.DateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "WORKERS")
class Worker extends Person {

    private static final long serialVersionUID = 1931740563334569696L;

    private DateTime startWorking;
    private DateTime endWorking;

}
