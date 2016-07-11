package ru.relesystem.pages;

import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;
import ru.relesystem.entity.Relay;

import java.util.List;

public class Index
{
    @Inject
    private Session session;
    public List<Relay> getAddresses()
    {
        return session.createCriteria(Relay.class).list();
    }
}