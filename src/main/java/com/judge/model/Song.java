package com.judge.model;

import org.springframework.web.multipart.MultipartFile;

public class Song {
    private String nameSong;
    private String infoSong;
    private MultipartFile imageSong;
    private MultipartFile fileMp3Song;
    private String lyric;
    private Long id;

    public Song() {
    }

    public Song(String nameSong, String infoSong, MultipartFile imageSong, MultipartFile fileMp3Song, String lyric, Long id) {
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

    public MultipartFile getImageSong() {
        return imageSong;
    }

    public void setImageSong(MultipartFile imageSong) {
        this.imageSong = imageSong;
    }

    public MultipartFile getFileMp3Song() {
        return fileMp3Song;
    }

    public void setFileMp3Song(MultipartFile fileMp3Song) {
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


