package com.kaaner.n11finalcaserestaurantservice.mapper;

import com.kaaner.n11finalcaserestaurantservice.dto.RestaurantDto;
import com.kaaner.n11finalcaserestaurantservice.entity.Restaurant;
import com.kaaner.n11finalcaserestaurantservice.request.RestaurantSaveRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RestaurantMapper {

    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    RestaurantDto restaurantToRestaurantDto(Restaurant restaurant);

    List<RestaurantDto> restaurantsToRestaurantDtoS(List<Restaurant> restaurant);

    Restaurant restaurantDtoToRestaurant(RestaurantDto restaurantDto);

    Restaurant restaurantSaveRequestToRestaurant(RestaurantSaveRequest restaurantSaveRequest);

}
