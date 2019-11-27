package com.judge.repository;

import com.judge.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PlaylistRepository extends JpaRepository<Playlist,Long> {
    Optional<Playlist> findAllByPlaylistNameContaining(String playlist_name);
    Optional<Playlist> findAllByUserUsername(String username);
    List<Playlist> findAllByUserId (Long userId);
}

