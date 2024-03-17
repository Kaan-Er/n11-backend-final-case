package com.kaaner.n11finalcaserestaurantservice.service.impl;

import com.kaaner.n11finalcaserestaurantservice.dto.RestaurantDto;
import com.kaaner.n11finalcaserestaurantservice.entity.Restaurant;
import com.kaaner.n11finalcaserestaurantservice.mapper.RestaurantMapper;
import com.kaaner.n11finalcaserestaurantservice.repository.RestaurantRepository;
import com.kaaner.n11finalcaserestaurantservice.request.RestaurantSaveRequest;
import com.kaaner.n11finalcaserestaurantservice.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;
    @Override
    public List<RestaurantDto> getAllRestaurants() {
        return RestaurantMapper.INSTANCE.restaurantsToRestaurantDtoS(restaurantRepository.findAll());
    }

    @Override
    public RestaurantDto getRestaurantById(Long id) {
        return RestaurantMapper.INSTANCE.restaurantToRestaurantDto(restaurantRepository.getById(id));
    }

    @Override
    public RestaurantDto saveRestaurant(RestaurantSaveRequest restaurant) {
        return RestaurantMapper.INSTANCE.restaurantToRestaurantDto(restaurantRepository.save(RestaurantMapper.INSTANCE.restaurantSaveRequestToRestaurant(restaurant)));
    }

    @Override
    public RestaurantDto updateRestaurant(Restaurant restaurant) {
        return RestaurantMapper.INSTANCE.restaurantToRestaurantDto(restaurantRepository.save(restaurant));
    }

    @Override
    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }
}
