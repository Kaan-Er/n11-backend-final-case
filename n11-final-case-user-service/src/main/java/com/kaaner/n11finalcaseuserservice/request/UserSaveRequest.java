package com.kaaner.n11finalcaseuserservice.request;

public record UserSaveRequest (
    String name,
    String surname,
    String email,
    String password,
    String phone,
    String address
){
    public UserSaveRequest {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (surname == null || surname.isBlank()) {
            throw new IllegalArgumentException("Surname cannot be null or empty");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }
        if (phone == null || phone.isBlank()) {
            throw new IllegalArgumentException("Phone cannot be null or empty");
        }
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address cannot be null or empty");
        }
    }
}