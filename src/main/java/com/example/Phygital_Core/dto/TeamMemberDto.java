package com.example.Phygital_Core.dto;

import lombok.*;
import java.util.UUID;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class TeamMemberDto {
    private UUID id;
    private String name;
    private boolean captain;
}