package com.example.Phygital_Core.repository;

import com.example.Phygital_Core.entity.TournamentApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface TournamentApplicationRepository extends JpaRepository<TournamentApplication, UUID> {
}
