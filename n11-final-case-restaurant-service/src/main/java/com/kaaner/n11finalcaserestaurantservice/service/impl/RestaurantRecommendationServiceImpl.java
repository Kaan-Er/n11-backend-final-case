package com.kaaner.n11finalcaserestaurantservice.service.impl;

import com.kaaner.n11finalcaserestaurantservice.dto.RestaurantDto;
import com.kaaner.n11finalcaserestaurantservice.mapper.RestaurantMapper;
import com.kaaner.n11finalcaserestaurantservice.repository.RestaurantRepository;
import com.kaaner.n11finalcaserestaurantservice.service.RestaurantRecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantRecommendationServiceImpl implements RestaurantRecommendationService{

    private final RestaurantRepository restaurantRepository;

    @Override
    public List<RestaurantDto> getRestaurantsLess10KM(double latitude, double longitude) {
        return RestaurantMapper.INSTANCE.restaurantsToRestaurantDtoS(restaurantRepository.findRestaurantsWithin10Km(latitude, longitude));
    }

    @Override
    public List<RestaurantDto> getRestaurantByDistanceLess10Km(double latitude, double longitude) {
        return RestaurantMapper.INSTANCE.restaurantsToRestaurantDtoS(restaurantRepository.findRestaurantsWithin10KmWeighted(latitude, longitude));
    }

    @Override
    public List<RestaurantDto> getRestaurantByScoreAndDistance(double latitude, double longitude) {
        return RestaurantMapper.INSTANCE.restaurantsToRestaurantDtoS(restaurantRepository.findRestaurantsWithin10KmWeightedAndDistance(latitude, longitude));
    }
}
