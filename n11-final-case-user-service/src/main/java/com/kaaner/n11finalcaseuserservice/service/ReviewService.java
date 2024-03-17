package com.kaaner.n11finalcaseuserservice.service;

import com.kaaner.n11finalcaseuserservice.dto.ReviewDto;
import com.kaaner.n11finalcaseuserservice.entity.Review;
import com.kaaner.n11finalcaseuserservice.enums.Score;
import com.kaaner.n11finalcaseuserservice.request.ReviewSaveRequest;

public interface ReviewService {
    ReviewDto save(ReviewSaveRequest review);
    void remove(Long id);
    ReviewDto update(Long reviewId, String text, Score score);
}
