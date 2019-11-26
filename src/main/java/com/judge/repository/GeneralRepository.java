package com.judge.repository;

import com.judge.model.Song;

import java.util.List;

public interface GeneralRepository<E> {
    List<E> findAll();

    E findById(Long id);

    void save(E e);

    void remove(Long id);
}
