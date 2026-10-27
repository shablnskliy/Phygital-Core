package com.example.Phygital_Core.controller;

import com.example.Phygital_Core.entity.TournamentApplication;
import com.example.Phygital_Core.repository.TournamentApplicationRepository;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/tournament-applications")
@RequiredArgsConstructor
@SecurityRequirement(name = "bearerAuth")
public class TournamentApplicationController {

    private final TournamentApplicationRepository applicationRepository;

    @GetMapping
    public ResponseEntity<List<TournamentApplication>> getAll() {
        return ResponseEntity.ok(applicationRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<TournamentApplication> create(@RequestBody TournamentApplication request) {
        return ResponseEntity.ok(applicationRepository.save(request));
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<TournamentApplication> updateStatus(@PathVariable UUID id, @RequestBody Map<String, String> body) {
        TournamentApplication app = applicationRepository.findById(id).orElseThrow();
        app.setStatus(body.get("status"));
        return ResponseEntity.ok(applicationRepository.save(app));
    }
}