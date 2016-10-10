package ru.relesystem.core.entities.relaytype;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class RelayType implements Serializable {

	private Integer id;

	private Integer version;

	private String name;

	private String lifetime;

}
