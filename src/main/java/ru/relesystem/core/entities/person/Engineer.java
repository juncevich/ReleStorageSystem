package ru.relesystem.core.entities.person;

import ru.relesystem.enums.Department;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ENGINEERS")
class Engineer extends Worker {
    private Enum<Department> department;
}
