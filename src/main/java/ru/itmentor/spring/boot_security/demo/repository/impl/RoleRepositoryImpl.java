package ru.itmentor.spring.boot_security.demo.repository.impl;

import org.springframework.stereotype.Repository;
import ru.itmentor.spring.boot_security.demo.model.Role;
import ru.itmentor.spring.boot_security.demo.repository.RoleRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class RoleRepositoryImpl implements RoleRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Role> findIdRoles(List<Long> id) {
        return entityManager.createQuery("select a from Role a where a.id in :id", Role.class)
                .setParameter("id", id).getResultList();
    }

    @Override
    public List<Role> getAllRoles() {
        return entityManager.createQuery("select a from Role a", Role.class).getResultList();
    }
}
