package com.tinroof.challenge.repository;

import com.tinroof.challenge.model.Calendar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Iterator;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CalendarRepositoryIntegrationTests {

    @Autowired
    private CalendarRepository calendarRepository;

    @Test
    public void testDeleteCalendar(){
        calendarRepository.deleteAll();
        Calendar calendar1 = new Calendar();
        calendar1.setName("testcal6");
        calendar1.setUser("testuser6");

        assertNull(calendar1.getId());
        calendarRepository.save(calendar1);

        Calendar calendar2= new Calendar();
        calendar2.setName("testcal7");
        calendar2.setUser("testuser7");

        assertNull(calendar2.getId());
        calendarRepository.save(calendar2);

        Long calendar1_Id = calendar1.getId();
        calendarRepository.deleteById(calendar1_Id);

        Optional<Calendar> fetchedCalendarOptional= calendarRepository.findById(calendar1_Id);
        assertFalse(fetchedCalendarOptional.isPresent());
    }


    @Test
    public void testGetAllCalendars(){
        calendarRepository.deleteAll();
        Calendar calendar1 = new Calendar();
        calendar1.setName("testcal4");
        calendar1.setUser("testuser4");

        assertNull(calendar1.getId());
        calendarRepository.save(calendar1);

        Calendar calendar2= new Calendar();
        calendar2.setName("testcal5");
        calendar2.setUser("testuser5");

        assertNull(calendar2.getId());
        calendarRepository.save(calendar2);

        Iterable<Calendar> fetchedCalendars= calendarRepository.findAll();
        Iterator iter =fetchedCalendars.iterator();
        int count = 0;
        for (int i=0; iter.hasNext(); i++){
            count++;
            iter.next();
        }
        assertEquals(2,count);
    }

    @Test
    public void testSaveAndGetCalendar(){
        Calendar calendar = new Calendar();
        calendar.setName("testcal4");
        calendar.setUser("testuser4");

        assertNull(calendar.getId());
        calendarRepository.save(calendar);
        assertNotNull(calendar.getId());

        Optional<Calendar> fetchedCalendarOptional= calendarRepository.findById(calendar.getId());
        Calendar fetchedCalendar =  fetchedCalendarOptional.get();


        //should not be null
        assertNotNull(fetchedCalendar);

        //should equal
        assertEquals(calendar.getId(), fetchedCalendar.getId());

    }
}