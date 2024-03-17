package com.kaaner.n11finalcaseuserservice.controller;

import com.kaaner.n11finalcaseuserservice.dto.ReviewDto;
import com.kaaner.n11finalcaseuserservice.mapper.ReviewMapper;
import com.kaaner.n11finalcaseuserservice.request.ReviewSaveRequest;
import com.kaaner.n11finalcaseuserservice.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping
    public ResponseEntity<ReviewDto> save(@RequestBody ReviewSaveRequest review) {
       return  ResponseEntity.ok(reviewService.save(review));
    }
}
