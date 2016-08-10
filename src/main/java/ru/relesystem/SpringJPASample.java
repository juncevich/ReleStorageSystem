package ru.relesystem;


import org.springframework.context.support.GenericXmlApplicationContext;
import ru.relesystem.entities.Relay;
import ru.relesystem.services.RelayService;

import java.util.List;

public class SpringJPASample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/datasource-tx-jpa.xml");
        ctx.refresh();

        RelayService contactService = ctx.getBean(
                "jpaRelayService", RelayService.class);

        List<Relay> relays = contactService.findAll();

        for(Relay relay : relays) {
            System.out.println(relay);
        }
    }
}
