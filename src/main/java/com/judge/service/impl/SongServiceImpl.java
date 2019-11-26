package com.judge.service.impl;

import com.judge.model.Song;
import com.judge.repository.SongRepository;
import com.judge.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SongServiceImpl implements SongService {

    @Autowired
    private SongRepository songRepository;

    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public Song findById(Long id) {
        return songRepository.findById(id);
    }

    @Override
    public void save(Song song) {
        songRepository.save(song);
    }

    @Override
    public void remove(Long id) {
        songRepository.remove(id);
    }
}
