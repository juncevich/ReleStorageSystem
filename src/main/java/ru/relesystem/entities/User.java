package ru.relesystem.entities;

/**
 * Class contains information about current user
 * necessary to define the permissions.
 */
public class User {
    /**
     * Contains the name of current user.
     */
    private String name;
    /**
     * Contains the password of current user.
     */
    private String password;
    /**
     * Contains the group to which the user belongs.
     */
    private String group;
    private String district;
    /**
     * Constructs an empty User, with empty parameters.
     */
    public User() {
    }

    /**
     * Construct User with specified parameters.
     * @param name users name
     * @param password users password
     * @param group users group
     */
    public User(String name, String password, String group) {
        this.name = name;
        this.password = password;
        this.group = group;
    }

    /**
     * Returns the name corresponding to this user.
     * @return the name corresponding to this user.
     */
    public String getName() {
        return name;
    }
    /**
     * Set the name corresponding to this user.
     * @param name  corresponding to this user.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the password corresponding to this user.
     * @return the password corresponding to this user.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the password corresponding to this user.
     * @param password  corresponding to this user.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * Returns the group corresponding to this user.
     * @return the group corresponding to this user.
     */
    public String getGroup() {
        return group;
    }
    /**
     * Set the group corresponding to this user.
     * @param group  corresponding to this user.
     */
    public void setGroup(String group) {
        this.group = group;
    }
}
