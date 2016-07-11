package ru.relesystem.pages.relay;

import ru.relesystem.pages.Index;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;
import ru.relesystem.entity.Relay;

public class CreateRelay
{
    @Property
    private Relay relay;

    @Inject
    private Session session;

    @InjectPage
    private Index index;

    @CommitAfter
    Object onSuccess()
    {
        session.persist(relay);

        return index;
    }
}
