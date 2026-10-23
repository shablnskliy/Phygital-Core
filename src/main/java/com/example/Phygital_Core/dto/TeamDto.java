package com.example.Phygital_Core.dto;

import lombok.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class TeamDto {
    private UUID id;
    private String name;
    private String discipline;
    private List<TeamMemberDto> members;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
