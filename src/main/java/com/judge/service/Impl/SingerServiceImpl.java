package com.judge.service.Impl;

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
    public List<Singer> findAllByUserId(Long userId) {
        return singerRepository.findAllByUserId(userId);
    }

    @Override
    public Singer findByIdSinger(Long id) {
        return singerRepository.findById(id).get();
    }

    @Override
    public void save(Singer singer) {
        singerRepository.save(singer);
    }

    @Override
    public void delete(Long id) {
        singerRepository.deleteById(id);
    }
}
