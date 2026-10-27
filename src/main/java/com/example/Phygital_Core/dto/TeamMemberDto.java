package com.example.Phygital_Core.dto;

import lombok.*;
import java.util.UUID;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class TeamMemberDto {
    private UUID id; // Фронтенд будет использовать это как ID пользователя
    private String name;
    private boolean captain;
}