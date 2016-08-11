package ru.relesystem.interfaces;


import ru.relesystem.entities.User;

public interface SecureLibrary {
    boolean login(User user);
    void  logout(User user);
}
