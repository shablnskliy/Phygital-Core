package com.example.Phygital_Core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterPayload {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}