package com.kaaner.n11finalcaserestaurantservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantDto {
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String imageUrl;
    private Double latitude;
    private Double longitude;
    private Double rating;
}
