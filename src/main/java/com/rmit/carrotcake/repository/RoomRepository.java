package com.rmit.carrotcake.repository;

import com.rmit.carrotcake.domain.Room;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoomRepository extends CrudRepository<Room, Long> {
    List<Room> findByNumRoomsAndRoomType(Integer numOfRooms, String roomType);
}
