package com.hw.example.wk13d2hw.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;


//    @OneToMany
//    @JoinColumn(name = "folder_id", nullable = false)
//    @JsonIgnoreProperties({"users"})
//    private List<Folder> folder;

    @JsonIgnoreProperties({"user"})
    @OneToMany(mappedBy="user", fetch = FetchType.LAZY)
    private List<Folder> folders;

    public User(String userName) {
        this.userName = userName;
        this.folders = new ArrayList<>();
    }

    public User() {
    }



//    G&S
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }

    public void addFolder(Folder folder) {
        return this.folders.add(folder);
    }
}
