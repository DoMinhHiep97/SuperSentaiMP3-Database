package com.judge.repository.impl;

import com.judge.model.User;
import com.judge.repository.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> findAll() {
        TypedQuery<User> query = em.createQuery("select u from User u", User.class);
        return query.getResultList();
    }

    @Override
    public User findById(Long id) {
        TypedQuery<User> query = em.createQuery("select u from User u where  u.id=:id", User.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void save(User user) {
        if(user.getId() != null){
            em.merge(user);
        } else {
            em.persist(user);
        }
    }

    @Override
    public void remove(Long id) {
        User user = findById(id);
        if(user != null){
            em.remove(user);
        }
    }
}
