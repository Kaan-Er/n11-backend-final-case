package com.kaaner.n11finalcaseuserservice.service.impl;

import com.kaaner.n11finalcaseuserservice.dto.ReviewDto;
import com.kaaner.n11finalcaseuserservice.entity.Review;
import com.kaaner.n11finalcaseuserservice.enums.Score;
import com.kaaner.n11finalcaseuserservice.mapper.ReviewMapper;
import com.kaaner.n11finalcaseuserservice.repository.ReviewRepository;
import com.kaaner.n11finalcaseuserservice.request.ReviewSaveRequest;
import com.kaaner.n11finalcaseuserservice.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    @Override
    public ReviewDto save(ReviewSaveRequest review) {
        Review r = ReviewMapper.INSTANCE.toReviewDtoFromReviewSaveRequest(review);
        return ReviewMapper.INSTANCE.toReviewDtoFromReview(reviewRepository.save(r));
    }

    @Override
    public void remove(Long id) {
        reviewRepository.deleteById(id);
    }

    @Override
    public ReviewDto update(Long reviewId, String text, Score score) {
        Review review = reviewRepository.getById(reviewId);
        review.setText(text);
        review.setScore(score);
        return ReviewMapper.INSTANCE.toReviewDto(reviewRepository.save(review));
    }
}