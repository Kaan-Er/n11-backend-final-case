package com.kaaner.n11finalcaserestaurantservice.request;

public record RestaurantSaveRequest(String name, String address, String phone, String email, String imageUrl, Double latitude, Double longitude, Double rating) {

    public RestaurantSaveRequest {
        if (this.name() == null || this.name().isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (this.address() == null || this.address().isBlank()) {
            throw new IllegalArgumentException("Address cannot be null or empty");
        }
        if (this.phone() == null || this.phone().isBlank()) {
            throw new IllegalArgumentException("Phone cannot be null or empty");
        }
        if (this.email() == null || this.email().isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        if (this.imageUrl() == null || this.imageUrl().isBlank()) {
            throw new IllegalArgumentException("ImageUrl cannot be null or empty");
        }
        if (this.latitude() == null) {
            throw new IllegalArgumentException("Latitude cannot be null");
        }
        if (this.longitude() == null) {
            throw new IllegalArgumentException("Longitude cannot be null");
        }
        if (this.rating() == null) {
            throw new IllegalArgumentException("Rating cannot be null");
        }
    }
}