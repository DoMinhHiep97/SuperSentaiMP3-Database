package com.judge.model;

import org.hibernate.annotations.NaturalId;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "singer")
public class Singer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String nameSinger;
    private String imageSinger;

    @ManyToMany
    @JoinTable(name = "song_singer",
            joinColumns = { @JoinColumn(name = "singer_id") },
            inverseJoinColumns = {@JoinColumn(name = "song_id") })
    private Set<Song> songs;

    public Singer() {
    }

    public Singer(String nameSinger, String imageSinger, Long id) {
        this.nameSinger = nameSinger;
        this.imageSinger = imageSinger;
        this.id = id;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public String getImageSinger() {
        return imageSinger;
    }

    public void setImageSinger(String imageSinger) {
        this.imageSinger = imageSinger;
    }
}
