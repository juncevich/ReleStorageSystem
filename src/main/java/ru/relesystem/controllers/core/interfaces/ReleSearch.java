package ru.relesystem.core.interfaces;

import java.util.Date;
import java.util.List;

import ru.relesystem.core.entities.Relay;
import ru.relesystem.core.location.RailwayCrossing;
import ru.relesystem.core.location.RailwayPoint;
import ru.relesystem.core.location.Station;
import ru.relesystem.core.location.Stativ;
import ru.relesystem.core.location.Unit;
import ru.relesystem.core.location.Workshop;

public interface ReleSearch {
	List<Relay> getReles();
	List<Relay> getReles(Unit unit);
	List<Relay> getReles(Station station);
	List<Relay> getReles(Workshop workshop);
	List<Relay> getReles(RailwayCrossing railwayCrossing);
	List<Relay> getReles(RailwayPoint railwayPoint);
	List<Relay> getReles(Person responsiblePerson);
	List<Relay> getReles(Stativ stativ);
	List<Relay> getReles(Date person);
	List<Relay> getReles(Integer serialNumber);
	List<Relay> getReles(String type);
}
