package com.kaaner.n11finalcaseuserservice.request;

public record ReviewSaveRequest(
    Long userId,
    Long productId,
    String comment,
    Integer rating
) {
    public ReviewSaveRequest {
        if (userId == null) {
            throw new IllegalArgumentException("User id cannot be null");
        }
        if (productId == null) {
            throw new IllegalArgumentException("Product id cannot be null");
        }
        if (comment == null || comment.isBlank()) {
            throw new IllegalArgumentException("Comment cannot be null or empty");
        }
        if (rating == null) {
            throw new IllegalArgumentException("Rating cannot be null");
        }
    }
}
