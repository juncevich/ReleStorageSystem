package ru.relesystem.beans;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by alex on 06.07.16.
 */
@Component
public class TestBeans {
    @Autowired
    private SessionFactory sessionFactory;

    public void test() {
        System.out.println("Session factory = " + sessionFactory);
    }
}
