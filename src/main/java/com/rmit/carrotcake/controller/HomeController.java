package com.rmit.carrotcake.controller;

import com.rmit.carrotcake.domain.Booking;
import com.rmit.carrotcake.domain.SearchDto;
import com.rmit.carrotcake.repository.BookingRepository;
import com.rmit.carrotcake.repository.RoomRepository;
import com.rmit.carrotcake.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Controller
public class HomeController {
    @Autowired
    RoomRepository roomRepository;
    @Autowired
    BookingRepository bookingRepository;


    @GetMapping("/rooms")
    public String room(Model model) {
        model.addAttribute("searchDto", new SearchDto());
        return "rooms";
    }

    @PostMapping("/searchRooms")
    public String searchRoom(Model model, SearchDto searchDto) {
        model.addAttribute("rooms",
            roomRepository.findByNumRoomsOrRoomType(
                searchDto.getNumOfPeople(),
                searchDto.getRoomType())
        );
        return "rooms";
    }
}
