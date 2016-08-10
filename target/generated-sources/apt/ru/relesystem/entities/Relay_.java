package ru.relesystem.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ru.relesystem.entities.storage.Stativ;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Relay.class)
public abstract class Relay_ {

	public static volatile SingularAttribute<Relay, Integer> shelvePosition;
	public static volatile SingularAttribute<Relay, Integer> number;
	public static volatile SingularAttribute<Relay, String> responsiblePerson;
	public static volatile SingularAttribute<Relay, Date> nextServiceDate;
	public static volatile SingularAttribute<Relay, Date> manufactureDate;
	public static volatile SingularAttribute<Relay, Long> id;
	public static volatile SingularAttribute<Relay, Date> lastServiceDate;
	public static volatile SingularAttribute<Relay, Stativ> stativ;
	public static volatile SingularAttribute<Relay, String> type;
	public static volatile SingularAttribute<Relay, Integer> version;

}

