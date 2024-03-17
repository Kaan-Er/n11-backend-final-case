package com.kaaner.n11finalcaseuserservice.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "restaurant", url = "http://localhost:8081/api/v1/restaurants")
public class RestaurantClient {

}
