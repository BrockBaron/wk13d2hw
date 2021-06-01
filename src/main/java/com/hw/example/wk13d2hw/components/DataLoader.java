package com.hw.example.wk13d2hw.components;


import com.hw.example.wk13d2hw.models.File;
import com.hw.example.wk13d2hw.models.Folder;
import com.hw.example.wk13d2hw.models.User;
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

        User bert = new User("Bert" );
        userRepository.save(bert);

        Folder bertsPartyCD = new Folder("Party CD");
        folderRepository.save(bertsPartyCD);

        File file1 = new File("File1", "jpg", 13000);
        fileRepository.save(file1);

        File file2 = new File("File2", "pgn", 13000);
        fileRepository.save(file2);

        File file3 = new File("File3", "vtk", 13000);
        fileRepository.save(file3);

        File file4 = new File("File4", "wav", 42000000);
        fileRepository.save(file4);

        File file5 = new File("File5", "mkv", 960000000);
        fileRepository.save(file5);

        File file6 = new File("File6", "vtk", 560000);
        fileRepository.save(file6);

        bert.addFolder(bertsPartyCD);
        userRepository.save(bert);

        bertsPartyCD.addFile(file1);














    }
}
