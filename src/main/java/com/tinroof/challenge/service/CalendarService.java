package com.tinroof.challenge.service;

import com.tinroof.challenge.model.Calendar;
import java.util.List;

import com.tinroof.challenge.repository.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CalendarService implements ICalendarService {
    @Autowired
    CalendarRepository calendarRepository;

    @Override
    public Iterable<Calendar> findAll() {

        Iterable<Calendar> calendars = calendarRepository.findAll();

        return calendars;
    }

    @Override
    public Calendar findById(Long id) {
        Calendar calendar = calendarRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Calendar " + "id:" + id));
        return calendar;
    }

    @Override
    public Calendar createCalendar(Calendar calendar) {
        return  calendarRepository.save(calendar);
    }

    @Override
    public ResponseEntity<?>  deleteCalendarById(Long id) {
        Calendar calendar = calendarRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Calendar " + "id:" + id));

        calendarRepository.delete(calendar);

        return ResponseEntity.ok().build();
    }
}