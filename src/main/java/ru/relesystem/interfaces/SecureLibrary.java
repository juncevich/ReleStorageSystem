package ru.relesystem.interfaces;


import entities.User;

public interface SecureLibrary {
    boolean login(User user);
    void  logout(User user);
}
