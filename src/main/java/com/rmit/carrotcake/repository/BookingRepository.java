package com.rmit.carrotcake.repository;

import com.rmit.carrotcake.domain.Booking;
import com.rmit.carrotcake.domain.Room;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking, Long> {
}
