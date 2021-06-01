package com.hw.example.wk13d2hw.repositories;

import com.hw.example.wk13d2hw.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
