package com.judge.service.impl;

import com.judge.model.Singer;
import com.judge.repository.SingerRepository;
import com.judge.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SingerServiceImpl implements SingerService {

    @Autowired
    private SingerRepository singerRepository;

    @Override
    public List<Singer> findAll() {
        return singerRepository.findAll();
    }

    @Override
    public Singer findById(Long id) {
        return singerRepository.findById(id);
    }

    @Override
    public void save(Singer singer) {
        singerRepository.save(singer);
    }

    @Override
    public void remove(Long id) {
        singerRepository.remove(id);
    }
}
