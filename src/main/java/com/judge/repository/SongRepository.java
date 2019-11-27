package com.judge.repository;

import com.judge.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SongRepository extends JpaRepository<Song,Long> {
    List<Song> findAllByUserId (Long userId);
    Optional<Song> findByNameSongContaining(String song);
    List<Song> findAllByOrderByLikeSongDesc();
    List<Song> findAllByOrderByListenSongDesc();
}
