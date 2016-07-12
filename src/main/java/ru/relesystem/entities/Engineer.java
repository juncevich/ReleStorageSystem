package ru.relesystem.entities;


import ru.relesystem.enums.Department;

import javax.persistence.Entity;

@Entity
public class Engineer extends Worker{
    private Enum<Department> department;
}
