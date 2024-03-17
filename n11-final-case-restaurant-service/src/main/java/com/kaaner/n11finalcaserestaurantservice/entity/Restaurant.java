package com.kaaner.n11finalcaserestaurantservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String name;
    @Column(nullable = false, length = 200)
    private String address;
    @Column(nullable = false, length = 20)
    private String phone;
    @Column(nullable = false, length = 100)
    private String email;
    @Column(nullable = false, length = 200)
    private String imageUrl;
    @Column(nullable = false)
    private Double latitude;
    @Column(nullable = false)
    private Double longitude;
    private Double rating;
    @Column(nullable = false, length = 100)
    private String registrationNumber;
}
