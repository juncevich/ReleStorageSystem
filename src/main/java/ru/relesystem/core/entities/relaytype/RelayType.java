package ru.relesystem.core.entities.relaytype;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "RELAY_TYPE")
public class RelayType implements Serializable {

    private static final long serialVersionUID = -550557015988154068L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    private String name;

    private String lifetime;

    public RelayType() {

    }

    /**
     * @return the {@link #name}
     */
    public String getName() {

        return name;
    }

    /**
     * @param name the {@link #name}  to set
     */
    public void setName(String name) {

        this.name = name;
    }

    /**
     * @return the {@link #lifetime}
     */
    public String getLifetime() {

        return lifetime;
    }

    /**
     * @param lifetime the {@link #lifetime}  to set
     */
    public void setLifetime(String lifetime) {

        this.lifetime = lifetime;
    }
}
