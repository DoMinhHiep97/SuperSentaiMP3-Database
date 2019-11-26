package com.judge.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name="song")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameSong;
    private String infoSong;
    private String imageSong;
    private String fileMp3Song;
    private String lyric;

    @ManyToMany(mappedBy = "songs")
    private Set<Singer> singers;

    public Song() {
    }

    public Song(String nameSong, String infoSong, String imageSong, String fileMp3Song, String lyric, Long id) {
        this.nameSong = nameSong;
        this.infoSong = infoSong;
        this.imageSong = imageSong;
        this.fileMp3Song = fileMp3Song;
        this.lyric = lyric;
        this.id = id;
    }



    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getInfoSong() {
        return infoSong;
    }

    public void setInfoSong(String infoSong) {
        this.infoSong = infoSong;
    }

    public String getImageSong() {
        return imageSong;
    }

    public void setImageSong(String imageSong) {
        this.imageSong = imageSong;
    }

    public String getFileMp3Song() {
        return fileMp3Song;
    }

    public void setFileMp3Song(String fileMp3Song) {
        this.fileMp3Song = fileMp3Song;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}


