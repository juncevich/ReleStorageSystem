package interfaces;


import entities.*;
import location.*;

import java.util.Date;
import java.util.List;

public interface ReleSearch {
    List<Rele> getReles();
    List<Rele> getReles(Unit unit);
    List<Rele> getReles(Station station);
    List<Rele> getReles(Workshop workshop);
    List<Rele> getReles(RailwayCrossing railwayCrossing);
    List<Rele> getReles(RailwayPoint railwayPoint);
    List<Rele> getReles(Person responsiblePerson);
    List<Rele> getReles(Stativ stativ);
    List<Rele> getReles(Date person);
    List<Rele> getReles(Integer serialNumber);
    List<Rele> getReles(String type);
}
