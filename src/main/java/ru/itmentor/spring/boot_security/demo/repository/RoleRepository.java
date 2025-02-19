package ru.itmentor.spring.boot_security.demo.repository;

import ru.itmentor.spring.boot_security.demo.model.Role;

import java.util.List;

public interface RoleRepository {

    List<Role> getAllRoles();
    List<Role> findIdRoles(List<Long> id);
}
