package com.tinroof.challenge.repository;

import com.tinroof.challenge.model.Calendar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarRepository extends CrudRepository<Calendar, Long> {

}
