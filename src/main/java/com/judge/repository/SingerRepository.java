package com.judge.repository;

import com.judge.model.Singer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SingerRepository extends JpaRepository<Singer, Long> {
    List<Singer> findAllByUserId (Long userId);
}
