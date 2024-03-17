package com.kaaner.n11finalcaserestaurantservice.repository;

import com.kaaner.n11finalcaserestaurantservice.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    List<Restaurant> findAll();
    // Bring restaurants less than 10 km away from the given latitude and longitude

    @Query(value = "SELECT * FROM restaurants r WHERE earth_distance(ll_to_earth(r.latitude, r.longitude), ll_to_earth(:latitude, :longitude)) / 1000 <= 10",
            nativeQuery = true)
    List<Restaurant> findRestaurantsWithin10Km(@Param("latitude") Double latitude, @Param("longitude") Double longitude);

    @Query(value = "SELECT *, (1 / earth_distance(ll_to_earth(r.latitude, r.longitude), ll_to_earth(:latitude, :longitude))) AS weight FROM restaurants r WHERE earth_distance(ll_to_earth(r.latitude, r.longitude), ll_to_earth(:latitude, :longitude)) / 1000 <= 10 ORDER BY weight DESC",
            nativeQuery = true)
    List<Restaurant> findRestaurantsWithin10KmWeighted(@Param("latitude") Double latitude, @Param("longitude") Double longitude);


    @Query(value = "SELECT *, (0.7 * r.rating + 0.3 * (1 / earth_distance(ll_to_earth(r.latitude, r.longitude), ll_to_earth(:latitude, :longitude)))) AS weighted_score FROM restaurants r WHERE earth_distance(ll_to_earth(r.latitude, r.longitude), ll_to_earth(:latitude, :longitude)) / 1000 <= 10 ORDER BY weighted_score DESC",
            nativeQuery = true)
    List<Restaurant> findRestaurantsWithin10KmWeightedAndDistance(@Param("latitude") Double latitude, @Param("longitude") Double longitude);
}
