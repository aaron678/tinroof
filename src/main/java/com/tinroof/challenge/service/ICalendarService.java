package com.tinroof.challenge.service;

import com.tinroof.challenge.model.Calendar;
import org.springframework.http.ResponseEntity;


public interface ICalendarService {

    public Iterable<Calendar> findAll();
    public Calendar findById(Long id);
    public Calendar createCalendar(Calendar calendar);
    public ResponseEntity<?> deleteCalendarById(Long id);

}