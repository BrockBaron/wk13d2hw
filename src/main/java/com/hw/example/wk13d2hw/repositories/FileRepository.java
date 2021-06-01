package com.hw.example.wk13d2hw.repositories;

import com.hw.example.wk13d2hw.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
