package ru.itmentor.spring.boot_security.demo.service;

import ru.itmentor.spring.boot_security.demo.model.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    List<Role> getAllRoles();
    List<Role> findIdRoles(List<Long> id);
    Optional<Role> findByIdRole(Long id);
}
