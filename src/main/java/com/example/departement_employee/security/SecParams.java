package com.example.departement_employee.security;

public interface SecParams {
    long EXP_TIME = 10L * 24 * 60 * 60 * 1000;
    String SECRET = "departement-employee-secret-key-2026";
    String PREFIX = "Bearer ";
}