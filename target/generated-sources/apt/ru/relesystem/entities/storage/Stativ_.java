package ru.relesystem.entities.storage;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ru.relesystem.entities.Relay;
import ru.relesystem.entities.location.Station;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Stativ.class)
public abstract class Stativ_ extends ru.relesystem.entities.storage.Storage_ {

	public static volatile ListAttribute<Stativ, Relay> relaysOnStativ;
	public static volatile SingularAttribute<Stativ, Integer> num;
	public static volatile SingularAttribute<Stativ, Station> station;

}

