package ru.relesystem.core.entities.relaytype;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "RELAY_TYPE")
@NamedQueries({@NamedQuery(name = "RelayType.findAll", query = "select rt from RelayType rt"),
		@NamedQuery(name = "RelayType.findById", query = "SELECT rt FROM RelayType rt WHERE rt.id = :id"),
		@NamedQuery(name = "RelayType.findByName", query = "SELECT rt FROM RelayType rt WHERE rt.name = :name")})
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
	 * @return the {@link #lifetime}
	 */
	public String getLifetime() {

		return lifetime;
    }

    /**
	 * @param name
	 *            the {@link #name} to set
	 */
	public void setName(String name) {

		this.name = name;
    }

    /**
     * @param lifetime the {@link #lifetime}  to set
     */
    public void setLifetime(String lifetime) {

        this.lifetime = lifetime;
    }
}
