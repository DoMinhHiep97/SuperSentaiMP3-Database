package com.judge.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Singer")
public class Singer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameSinger;
    private MultipartFile imageSinger;

    @ManyToMany(mappedBy = "singers")
    private Collection<Song> songs;

    public Singer() {
    }

    public Singer(String nameSinger, MultipartFile imageSinger, Long id) {
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

    public MultipartFile getImageSinger() {
        return imageSinger;
    }

    public void setImageSinger(MultipartFile imageSinger) {
        this.imageSinger = imageSinger;
    }
}
