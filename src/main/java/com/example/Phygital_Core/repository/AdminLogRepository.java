package com.example.Phygital_Core.repository;

import com.example.Phygital_Core.entity.AdminLog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface AdminLogRepository extends JpaRepository<AdminLog, UUID> {
}