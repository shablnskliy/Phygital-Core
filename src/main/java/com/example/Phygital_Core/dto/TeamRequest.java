package com.example.Phygital_Core.dto;
import lombok.*;
import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
public class TeamRequest {
    private String name;
    private String discipline;
    private List<TeamMemberRequest> members;
}
