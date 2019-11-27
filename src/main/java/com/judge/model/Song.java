package com.judge.model;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameSong;
    private String category;

    @ManyToOne
    @JoinColumn
    private User user ;

    @Lob
    @Column(name ="lyrics",length = 51200)
    private String lyrics;

    private int likeSong;
    private int listenSong;
    private String avatarUrl;
    private String mp3Url;

    @Column(columnDefinition = "long")
    private String describes;

    public Song() {
    }

    public Song(String nameSong, String category, User user, String lyrics, int likeSong, int listenSong, String avatarUrl, String mp3Url, String describes) {
        this.nameSong = nameSong;
        this.category = category;
        this.user = user;
        this.lyrics = lyrics;
        this.likeSong = likeSong;
        this.listenSong = listenSong;
        this.avatarUrl = avatarUrl;
        this.mp3Url = mp3Url;
        this.describes = describes;
    }
}
