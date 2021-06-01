package com.hw.example.wk13d2hw.components;


import com.hw.example.wk13d2hw.repositories.FileRepository;
import com.hw.example.wk13d2hw.repositories.FolderRepository;
import com.hw.example.wk13d2hw.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public void run(ApplicationArguments args) {












    }
}
