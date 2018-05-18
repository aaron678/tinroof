package com.tinroof.challenge.controller;

import com.tinroof.challenge.model.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.tinroof.challenge.service.ICalendarService;

import javax.validation.Valid;

@RestController
public class CalendarController {

    @Autowired
    private ICalendarService calendarService;


    @GetMapping("/calendar")
    public Iterable<Calendar> findCalendar() {

        return calendarService.findAll();
    }

    @GetMapping("/calendar/{id}")
    public Calendar findCalendar(@PathVariable Long id) {
        
        return calendarService.findById(id);
    }

    @PostMapping("/calendar")
    public Calendar createCalendar(@Valid @RequestBody Calendar calendar) {

        return calendarService.createCalendar(calendar);
    }

    @DeleteMapping("/calendar/{id}")
    public ResponseEntity<?> deleteCalendar(@PathVariable Long id) {

        return calendarService.deleteCalendarById(id);
    }

}