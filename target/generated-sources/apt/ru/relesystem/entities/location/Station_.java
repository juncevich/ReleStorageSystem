package ru.relesystem.entities.location;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ru.relesystem.entities.storage.Stativ;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Station.class)
public abstract class Station_ extends ru.relesystem.entities.location.Location_ {

	public static volatile ListAttribute<Station, Stativ> storageList;
	public static volatile SingularAttribute<Station, String> stationName;

}

