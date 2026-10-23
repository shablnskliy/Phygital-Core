package com.example.Phygital_Core.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class ProfilePatch {
    private String firstName;
    private String lastName;
    private String phone;
    private String telegram;
    private LocalDate birthDate;
    private String bio;
}
