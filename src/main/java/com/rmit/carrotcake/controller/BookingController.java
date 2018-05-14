package com.rmit.carrotcake.controller;

import com.rmit.carrotcake.domain.Booking;
import com.rmit.carrotcake.repository.BookingRepository;
import com.rmit.carrotcake.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Controller
public class BookingController {
    @Autowired
    RoomRepository roomRepository;
    @Autowired
    BookingRepository bookingRepository;

    @GetMapping("/booking/{roomId}")
    public String booking(Model model, @PathVariable Long roomId) {
        model.addAttribute("roomId", roomId);
        model.addAttribute("booking", new Booking());
        return "booking";
    }

    @PostMapping("/booking")
    public String greetingSubmit(@ModelAttribute Booking booking, Model model) {
//        Booking booking = new Booking();
//        booking.setRoomId(roomId);
//        booking.setStartDate(LocalDate.now());
//        booking.setEndDate(LocalDate.now().plusDays(3));
//        bookingRepository.save(booking);
         model.addAttribute("message", "Booking Saved!");
        return "booking";
    }
}
