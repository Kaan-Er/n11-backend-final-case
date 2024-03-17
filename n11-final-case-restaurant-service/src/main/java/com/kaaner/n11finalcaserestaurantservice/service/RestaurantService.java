package com.kaaner.n11finalcaserestaurantservice.service;

import com.kaaner.n11finalcaserestaurantservice.dto.RestaurantDto;
import com.kaaner.n11finalcaserestaurantservice.entity.Restaurant;
import com.kaaner.n11finalcaserestaurantservice.request.RestaurantSaveRequest;

import java.util.List;

public interface RestaurantService {
    List<RestaurantDto> getAllRestaurants();
    RestaurantDto getRestaurantById(Long id);
    RestaurantDto saveRestaurant(RestaurantSaveRequest restaurant);
    RestaurantDto updateRestaurant(Restaurant restaurant);
    void deleteRestaurant(Long id);
}
