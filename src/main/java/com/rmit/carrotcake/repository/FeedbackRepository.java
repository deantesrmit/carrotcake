package com.rmit.carrotcake.repository;

import com.rmit.carrotcake.domain.Booking;
import com.rmit.carrotcake.domain.Feedback;
import org.springframework.data.repository.CrudRepository;

public interface FeedbackRepository extends CrudRepository<Feedback, Long> {
}
