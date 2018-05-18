package com.tinroof.challenge.controller;

import com.tinroof.challenge.model.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.tinroof.challenge.service.ICalendarService;

import javax.validation.Valid;

@RestController
public class CalendarController {

    @Autowired
    private ICalendarService calendarService;

    /**
     * Returns all calendar objects.
     * @return
     */
    @GetMapping("/calendars")
    public Iterable<Calendar> findCalendar() {

        return calendarService.findAll();
    }

    /**
     * Returns a single calendar object by database id
     * @param id
     * @return
     */
    @GetMapping("/calendar/{id}")
    public Calendar findCalendar(@PathVariable Long id) {
        
        return calendarService.findById(id);
    }

    /**
     * Creates a new calendar object
     * @param calendar
     * @return
     */
    @PostMapping("/calendar")
    public Calendar createCalendar(@Valid @RequestBody Calendar calendar) {

        return calendarService.createCalendar(calendar);
    }

    /**
     * Deletes a calendar object
     * @param id
     * @return
     */
    @DeleteMapping("/calendar/{id}")
    public ResponseEntity<?> deleteCalendar(@PathVariable Long id) {

        return calendarService.deleteCalendarById(id);
    }

}