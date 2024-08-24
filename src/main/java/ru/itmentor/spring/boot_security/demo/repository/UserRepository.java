package ru.itmentor.spring.boot_security.demo.repository;


import ru.itmentor.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserRepository {
     List<User> getAll();
     void addUser(User user);
     void updateUser(User user);
     void deleteUser(long id);
     User getUser(long id);
     User findByUsername(String username);
}
