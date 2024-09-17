package com.sai.userservice.repositories;

import com.sai.userservice.models.Session;
import com.sai.userservice.models.SessionStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SessionRepository extends JpaRepository<Session, Long> {

    Optional<Session> findByTokenAndUser_Id(String token, Long userId);
}