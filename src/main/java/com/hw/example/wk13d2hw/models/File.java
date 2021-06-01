package com.hw.example.wk13d2hw.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_ext")
    private String fileExt;

    @Column(name = "file_size")
    private int fileSize;

    //many files to one folder
    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    @JsonIgnoreProperties({"files"})
    private Folder folder;

    public File(String fileName, String fileExt, int fileSize) {
        this.fileName = fileName;
        this.fileExt = fileExt;
        this.fileSize = fileSize;
    }

    public File() {
    }


}
