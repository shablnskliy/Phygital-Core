package com.example.Phygital_Core.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class AdminLogRequest {
    private LocalDateTime date;
    private String admin;
    private String action;
    private String entityType;
    private String entityId;
    private String details;
}
