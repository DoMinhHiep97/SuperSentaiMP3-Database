package com.judge.repository.impl;

import com.judge.model.Song;
import com.judge.repository.SongRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class SongRepositoryImpl implements SongRepository {
@PersistenceContext
private EntityManager em;

    @Override
    public List<Song> findAll() {
        TypedQuery<Song> query = em.createQuery("select s from Song s", Song.class);
        return query.getResultList();
    }

    @Override
    public Song findById(Long id) {
        TypedQuery<Song> query = em.createQuery("select s from Song s where  s.id=:id", Song.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void save(Song song) {
        if(song.getId() != null){
            em.merge(song);
        } else {
            em.persist(song);
        }
    }

    @Override
    public void remove(Long id) {
        Song song = findById(id);
        if(song != null){
            em.remove(song);
        }
    }
}
