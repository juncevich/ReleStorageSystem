package ru.relesystem.interfaces;


import ru.relesystem.entities.Relay;
import ru.relesystem.location.*;

import java.util.Date;
import java.util.List;

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
