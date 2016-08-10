package ru.relesystem.entities.person;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Person.class)
public abstract class Person_ {

	public static volatile SingularAttribute<Person, Long> stuffId;
	public static volatile SingularAttribute<Person, String> firstName;
	public static volatile SingularAttribute<Person, Enum> post;
	public static volatile SingularAttribute<Person, byte[]> photo;
	public static volatile SingularAttribute<Person, Integer> id;
	public static volatile SingularAttribute<Person, String> thirdName;
	public static volatile SingularAttribute<Person, Integer> version;
	public static volatile SingularAttribute<Person, String> secondName;

}

