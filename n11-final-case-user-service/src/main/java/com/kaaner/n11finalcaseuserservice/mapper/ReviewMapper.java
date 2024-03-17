package com.kaaner.n11finalcaseuserservice.mapper;

import com.kaaner.n11finalcaseuserservice.dto.ReviewDto;
import com.kaaner.n11finalcaseuserservice.entity.Review;
import com.kaaner.n11finalcaseuserservice.request.ReviewSaveRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReviewMapper {
    ReviewMapper INSTANCE = Mappers.getMapper(ReviewMapper.class);

    ReviewDto toReviewDtoFromReview(Review review);
    ReviewDto toReviewDtoFromReviewSaveRequest(ReviewSaveRequest reviewSaveRequest);
}
