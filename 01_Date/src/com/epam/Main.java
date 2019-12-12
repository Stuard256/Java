package com.epam;

import com.epam.entity.Date;
import com.epam.services.DateServiceImpl;
import com.epam.validator.DateValidator;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        DateValidator validator = new DateValidator();
        List<Date> dates = new ArrayList<>();
            validator.readInput(dates);
            if(!dates.isEmpty()){
                for(Date date: dates) {
                    DateServiceImpl service = new DateServiceImpl();
                    service.showDate(service.getNextDay(date));
                    service.showDate(service.getPrevDay(date));
                    service.showDate(service.getNextMonth(date));
                    service.showDate(service.getPrevMonth(date));
                    service.showDate(service.getNextYear(date));
                    service.showDate(service.getPrevYear(date));
                    System.out.println("---------------------------");
                };
            }
    }
}
