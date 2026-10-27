package com.example.Phygital_Core.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tournament_applications")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class TournamentApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private UUID teamId;

    @Column(nullable = false)
    private UUID tournamentId;

    @Column(nullable = false)
    private String captainName;

    @Column(columnDefinition = "TEXT")
    private String additionalInfo;

    @Column(nullable = false)
    private String status; // NEW, APPROVED, REJECTED

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        if (this.status == null) this.status = "NEW";
    }
}
