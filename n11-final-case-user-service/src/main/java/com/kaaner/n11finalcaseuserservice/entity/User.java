package com.kaaner.n11finalcaseuserservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, length = 50)
    private String surname;
    @Column(nullable = false, unique = true, length = 100)
    private String email;
    @Column(nullable = false, length = 30)
    private String password;
    @Column(nullable = false, length = 200)
    private String address;
    @Column(nullable = false, length = 20)
    private double latitude;
    @Column(nullable = false, length = 20)
    private double longitude;
}
