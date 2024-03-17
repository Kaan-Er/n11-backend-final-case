package com.kaaner.n11finalcaserestaurantservice.service;

import com.kaaner.n11finalcaserestaurantservice.dto.RestaurantDto;

import java.util.List;

public interface RestaurantRecommendationService {
    List<RestaurantDto> getRestaurantsLess10KM(double latitude, double longitude);
    List<RestaurantDto> getRestaurantByDistanceLess10Km(double latitude, double longitude);
    List<RestaurantDto> getRestaurantByScoreAndDistance(double latitude, double longitude);
}
