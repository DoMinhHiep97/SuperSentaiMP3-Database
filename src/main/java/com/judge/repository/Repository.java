package com.judge.repository;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();
    void save(T model);
    void remove(Long id);
}
