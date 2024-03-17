package com.kaaner.n11finalcaserestaurantservice.controller;

import com.kaaner.n11finalcaserestaurantservice.dto.RestaurantDto;
import com.kaaner.n11finalcaserestaurantservice.entity.Restaurant;
import com.kaaner.n11finalcaserestaurantservice.request.RestaurantSaveRequest;
import com.kaaner.n11finalcaserestaurantservice.service.RestaurantRecommendationService;
import com.kaaner.n11finalcaserestaurantservice.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Repository
@RequestMapping("/api/v1/restaurants")
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantService restaurantService;
    private final RestaurantRecommendationService restaurantRecommendationService;

    @GetMapping
    public ResponseEntity<List<RestaurantDto>> getAllRestaurants(){
        return ResponseEntity.ok(restaurantService.getAllRestaurants());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RestaurantDto> getRestaurantById(@PathVariable Long id) {
        return ResponseEntity.ok(restaurantService.getRestaurantById(id));
    }

    @PostMapping
    public ResponseEntity<RestaurantDto> saveRestaurant(RestaurantSaveRequest restaurant) {
        return ResponseEntity.ok(restaurantService.saveRestaurant(restaurant));
    }

    @GetMapping("/within10km")
    public ResponseEntity<List<RestaurantDto>> getRestaurantsWithin10Km(@RequestParam("latitude") Double latitude,
                                                                     @RequestParam("longitude") Double longitude) {
        List<RestaurantDto> restaurants = restaurantRecommendationService.getRestaurantsLess10KM(latitude, longitude);
        return ResponseEntity.ok(restaurants);
    }

    @GetMapping("/weighted")
    public ResponseEntity<List<RestaurantDto>> getRestaurantsWithin10KmWeighted(@RequestParam("latitude") Double latitude,
                                                                             @RequestParam("longitude") Double longitude) {
        List<RestaurantDto> restaurants = restaurantRecommendationService.getRestaurantByDistanceLess10Km(latitude, longitude);
        return  ResponseEntity.ok(restaurants);
    }

    @GetMapping("/weighted-and-distance")
    public ResponseEntity<List<RestaurantDto>> getRestaurantsWithin10KmWeightedAndDistance(@RequestParam("latitude") Double latitude,
                                                                                        @RequestParam("longitude") Double longitude) {
        List<RestaurantDto> restaurants = restaurantRecommendationService.getRestaurantByScoreAndDistance(latitude, longitude);
        return ResponseEntity.ok(restaurants);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RestaurantDto> updateRestaurant(@PathVariable Long id, @RequestBody Restaurant restaurant) {
        return ResponseEntity.ok(restaurantService.updateRestaurant(restaurant));
    }

    @DeleteMapping("/{id}")
    public void deleteRestaurant(@PathVariable Long id) {
        restaurantService.deleteRestaurant(id);
    }
}
