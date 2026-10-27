package com.example.Phygital_Core.repository;

import com.example.Phygital_Core.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface FeedbackRepository extends JpaRepository<Feedback, UUID> {
}