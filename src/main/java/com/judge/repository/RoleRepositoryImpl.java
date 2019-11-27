package com.judge.repository;

import com.judge.model.Role;
import com.judge.model.User;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class RoleRepositoryImpl implements RoleRepository {
    @PersistenceContext
    private EntityManager em;
    @Override
    public Role findById(Long id) {
        TypedQuery<Role> query = em.createQuery("select c from Role c where  c.id=:id", Role.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }

    @Override
    public List<Role> findAll() {
        TypedQuery<Role> query = em.createQuery("select c from Role c", Role.class);
        return query.getResultList();
    }

    @Override
    public void save(Role model) {
        if(model.getId() != null){
            em.merge(model);
        } else {
            em.persist(model);
        }
    }

    @Override
    public void remove(Long id) {
        Role role = findById(id);
        if(role != null){
            em.remove(role);
        }
    }
}
