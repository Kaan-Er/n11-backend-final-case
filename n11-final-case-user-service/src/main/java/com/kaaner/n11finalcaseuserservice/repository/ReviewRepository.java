package com.kaaner.n11finalcaseuserservice.repository;

import com.kaaner.n11finalcaseuserservice.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
