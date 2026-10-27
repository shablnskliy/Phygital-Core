package com.example.Phygital_Core.dto;

import lombok.*;

import java.util.UUID;

@Data @NoArgsConstructor @AllArgsConstructor
public class TeamMemberRequest {
    private String name;
    private boolean captain;
    private UUID userId;
}