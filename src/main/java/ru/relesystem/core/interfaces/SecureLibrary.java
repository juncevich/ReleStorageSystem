package ru.relesystem.core.interfaces;

import ru.relesystem.core.entities.User;

public interface SecureLibrary {
    boolean login(User user);

    void logout(User user);
}
