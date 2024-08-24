package ru.itmentor.spring.boot_security.demo.service;

import ru.itmentor.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(long id);
    void deleteUser(long id);
    void saveUser(User user);
    void updateUser(User user);
    User findByUsername(String username);
}
