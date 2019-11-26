package com.judge.repository.impl;

import com.judge.model.Singer;
import com.judge.repository.SingerRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class SingerRepositoryImpl implements SingerRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Singer> findAll() {
        TypedQuery<Singer> query= em.createQuery("select s from Singer s", Singer.class);
        return query.getResultList();
    }

    @Override
    public Singer findById(Long id) {
        TypedQuery<Singer> query = em.createQuery("select s from Singer s where  s.id=:id", Singer.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void save(Singer singer) {
        if(singer.getId() !=null){
            em.merge(singer);
        }else {
            em.persist(singer);
        }
    }

    @Override
    public void remove(Long id) {
        Singer singer = findById(id);
        if(singer != null){
            em.remove(singer);
        }
    }
}
