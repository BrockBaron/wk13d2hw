package com.hw.example.wk13d2hw.repositories;


import com.hw.example.wk13d2hw.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
