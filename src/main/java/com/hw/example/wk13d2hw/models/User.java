package com.hw.example.wk13d2hw.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Column(name = "name")
    private String name;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "folder_id", nullable = false)
    @JsonIgnoreProperties({"users"})
    private List<Folder> folder;

    public User(String name) {
        this.name = name;
        this.id = id;
        this.folder = new ArrayList<>();
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Folder> getFolder() {
        return folder;
    }

    public void setFolder(List<Folder> folder) {
        this.folder = folder;
    }
}
