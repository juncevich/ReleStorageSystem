package ru.relesystem.entities;


import ru.relesystem.enums.Department;

import javax.persistence.Entity;

@Entity
public class Engineer extends Person{
    private Enum<Department> department;
}
