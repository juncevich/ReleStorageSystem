package ru.relesystem;

import org.springframework.context.support.GenericXmlApplicationContext;
import ru.relesystem.dao.ReleDAO;
import ru.relesystem.entities.Relay;

import java.util.List;

public class SpringHibernateSample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("META-INF/spring/app-context-annotation.xml");
        ctx.refresh();
        ReleDAO releDAO = ctx.getBean("relayDao", ReleDAO.class);
        listRelays(releDAO.getRelays());

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
