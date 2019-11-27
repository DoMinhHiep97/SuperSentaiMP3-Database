package com.judge.service;

import com.judge.model.Singer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SingerService {
    List<Singer> findAll();

    List<Singer> findAllByUserId(Long userId);

    Singer findByIdSinger(Long id);

    void save(Singer singer);

    void delete(Long id);
}
