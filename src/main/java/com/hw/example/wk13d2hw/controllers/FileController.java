package com.hw.example.wk13d2hw.controllers;

import com.hw.example.wk13d2hw.models.File;
import com.hw.example.wk13d2hw.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    // INDEX
    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles(){
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }
    //GET
    @GetMapping(value = "/files/{id}")
    public ResponseEntity<Optional<File>> getFile(@PathVariable Long id){
        return new ResponseEntity<>(fileRepository.findById(id), HttpStatus.OK) ;
    }
    //POST
    @PostMapping(value = "/files")
    public ResponseEntity<File> postFiles(@RequestBody File file){
        fileRepository.save(file);
        return new ResponseEntity<>(file, HttpStatus.CREATED);
    }
}
