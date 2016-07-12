package ru.relesystem.entities;

import org.joda.time.DateTime;

import java.sql.Date;

/**
 * Created by alex on 12.07.16.
 */
public class Person {
    private int id;
    private int version;
    private long stuffId;
    private String firstName;
    private String secondName;
    private String thirdName;
    private Enum<char> post;
    private DateTime startWorking;
    private DateTime endWorking;
}
