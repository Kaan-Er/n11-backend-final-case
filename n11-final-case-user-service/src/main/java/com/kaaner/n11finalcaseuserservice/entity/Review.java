package com.kaaner.n11finalcaseuserservice.entity;

import com.kaaner.n11finalcaseuserservice.enums.Score;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long userId;
    @Column(nullable = false)
    private Long restaurantId;
    private String text;
    @Column(nullable = false)
    private Score score;
}
