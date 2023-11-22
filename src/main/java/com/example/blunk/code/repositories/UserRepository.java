package com.example.blunk.code.repositories;

import com.example.blunk.code.domain.Order;
import com.example.blunk.code.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
