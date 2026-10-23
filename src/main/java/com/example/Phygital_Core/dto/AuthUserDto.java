package com.example.Phygital_Core.dto;

import com.example.Phygital_Core.entity.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthUserDto {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String telegram;
    private LocalDate birthDate;
    private UserRole role;
    private String bio;
    private String avatar;
    private LocalDateTime createdAt;
}