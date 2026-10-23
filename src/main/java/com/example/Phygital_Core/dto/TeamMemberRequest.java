package com.example.Phygital_Core.dto;

import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor
public class TeamMemberRequest {
    private String name;
    private boolean captain;
}