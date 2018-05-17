package com.rmit.carrotcake.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;


public class SearchDto {
    Integer numOfBeds;
    Integer numOfPeople;
    String roomType;

    public Integer getNumOfBeds() {
        return numOfBeds;
    }

    public void setNumOfBeds(Integer numOfBeds) {
        this.numOfBeds = numOfBeds;
    }

    public Integer getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(Integer numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
}
