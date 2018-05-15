package com.rmit.carrotcake.controller;

import com.rmit.carrotcake.domain.Booking;
import com.rmit.carrotcake.domain.Feedback;
import com.rmit.carrotcake.domain.Room;
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
        Booking booking = new Booking();
        Room room = new Room();
        room.setId(roomId);
        booking.setRoom(room);
        model.addAttribute("booking", booking);
        return "booking";
    }

    @PostMapping("/booking")
    public String greetingSubmit(@ModelAttribute Booking booking, Model model) {
        bookingRepository.save(booking);
        model.addAttribute("message", "Booking Saved!");
        return "booking";
    }

    @GetMapping("/bookings")
    public String bookings(Model model) {
        model.addAttribute("bookings", bookingRepository.findAll());
        return "bookings";
    }

    @GetMapping("/feedback/{bookingId}")
    public String feedback(Model model, @PathVariable Long bookingId) {
        model.addAttribute("feedback", new Feedback());
        return "feedback";
    }

    @PostMapping("/feedback")
    public String feedbackSubmit(@ModelAttribute Booking booking, Model model) {
        bookingRepository.save(booking);
        model.addAttribute("message", "Booking Saved!");
        return "booking";
    }
}
