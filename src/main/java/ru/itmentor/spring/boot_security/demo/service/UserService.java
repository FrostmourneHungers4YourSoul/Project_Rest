package ru.itmentor.spring.boot_security.demo.service;

import ru.itmentor.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAll();
    User getById(long id);
    void deleteUser(long id);
    User saveUser(User user);
    User updateUser(User user);
    User findByUsername(String username);
}
