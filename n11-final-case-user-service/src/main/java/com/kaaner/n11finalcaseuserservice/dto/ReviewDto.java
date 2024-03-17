package com.kaaner.n11finalcaseuserservice.dto;

import com.kaaner.n11finalcaseuserservice.enums.Score;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDto {
    private Long id;
    private Long userId;
    private Long restaurantId;
    private String text;
    private Score score;
}
