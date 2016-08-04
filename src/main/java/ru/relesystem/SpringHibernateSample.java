package ru.relesystem;

import org.springframework.context.support.GenericXmlApplicationContext;
import ru.relesystem.dao.ReleDAO;
import ru.relesystem.dao.StationDao;
import ru.relesystem.dao.StativDAO;
import ru.relesystem.entities.Relay;
import ru.relesystem.entities.location.Station;
import ru.relesystem.entities.storage.Stativ;

import java.util.Date;
import java.util.List;

public class SpringHibernateSample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("META-INF/spring/app-context-annotation.xml");
        ctx.refresh();
        ReleDAO releDAO = ctx.getBean("relayDao", ReleDAO.class);
        StativDAO stativDAO = ctx.getBean("stativDao", StativDAO.class);
        StationDao stationDAO = ctx.getBean("stationDao", StationDao.class);
        listRelays(releDAO.getRelays());
        Relay relay = releDAO.getRelaysById(1l);
        System.out.println("");
        System.out.println("Relay with 1 id: " + relay);
        System.out.println("");
        Station kedrovka = new Station();
        kedrovka.setStationName("Кедровка");
        stationDAO.save(kedrovka);
        Stativ stativ = new Stativ();
        stativ.setNum(100);
        stativ.setStation(kedrovka);

        Relay relay1 = new Relay();
        relay1.setNumber(2);
        relay1.setShelvePosition(111);
 //       relay1.setStativ(stativ);
        relay1.setType("YVI");
        relay1.setLastServiceDate(new Date());
        relay1.setManufactureDate(new Date());
        relay1.setNextServiceDate(new Date());
        relay1.setResponsiblePerson("Person");
        stativ.addRele(relay1);
        stativDAO.save(stativ);
        kedrovka.addStativ(stativ);
        releDAO.save(relay1);
        System.out.println(relay1);


    }

    private static void listRelays(List<Relay> relays) {
        System.out.println("");
        System.out.println("Listing relays without details:");

        for (Relay relay : relays) {
            System.out.println(relay);
            System.out.println();
        }
    }
}
