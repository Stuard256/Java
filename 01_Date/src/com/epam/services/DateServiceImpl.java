package com.epam.services;

import com.epam.entity.Date;

public class DateServiceImpl implements DateService {

    DateValidatorServiceImpl service = new DateValidatorServiceImpl();

    @Override
    public void showDate(Date date) {
        System.out.println(date.getDay()+ "." + date.getMonth() + "." + date.getYear());
    }

    @Override
    public Date getNextDay(Date date) {

        Date nextDay = new Date(date.getDay(),date.getMonth(),date.getYear());

        if(nextDay.getDay() < service.findDaysInMonth(nextDay.getMonth())){
            nextDay.setDay((byte) (nextDay.getDay() + 1));
        }
        else{
            if (nextDay.getMonth() < 12){
                nextDay.setMonth(getNextMonth(nextDay).getMonth());
                nextDay.setDay((byte) 1);
            }
            else{
                nextDay.setMonth((byte) 1);
                nextDay.setDay((byte) 1);
                nextDay.setYear(getNextYear(nextDay).getYear());
            }
        }

        return nextDay;
    }

    @Override
    public Date getPrevDay(Date date) {

        Date prevDay = new Date(date.getDay(),date.getMonth(),date.getYear());

        if(prevDay.getDay() > 1){
            prevDay.setDay((byte) (prevDay.getDay() - 1));
        }
        else{
            if (prevDay.getMonth() > 1){
                prevDay.setMonth(getPrevMonth(prevDay).getMonth());
                prevDay.setDay((byte) service.findDaysInMonth(prevDay.getMonth()));
            }
            else{
                prevDay.setMonth((byte) 12);
                prevDay.setDay((byte) service.findDaysInMonth(prevDay.getMonth()) );
                prevDay.setYear(getPrevYear(prevDay).getYear());
            }
        }

        return prevDay;
    }

    @Override
    public Date getNextMonth(Date date) {

        Date nextMonth = new Date(date.getDay(),date.getMonth(),date.getYear());

        if (nextMonth.getMonth() < 12){
            nextMonth.setMonth((byte) (nextMonth.getMonth() + 1));
        }
        else{
            nextMonth.setMonth((byte) 1);
        }
        return nextMonth;
    }

    @Override
    public Date getPrevMonth(Date date) {
        Date prevMonth = new Date(date.getDay(),date.getMonth(),date.getYear());
        if (prevMonth.getMonth() > 1){
            prevMonth.setMonth((byte) (prevMonth.getMonth() - 1));
        }
        else{
            prevMonth.setMonth((byte) 12);
        }
        return prevMonth;
    }

    @Override
    public Date getNextYear(Date date) {
        Date nextYear = new Date(date.getDay(),date.getMonth(),date.getYear());
        if(nextYear.getYear() < Integer.MAX_VALUE){
            nextYear.setYear(nextYear.getYear() + 1);
        }
        return nextYear;
    }

    @Override
    public Date getPrevYear(Date date) {
        Date prevYear = new Date(date.getDay(),date.getMonth(),date.getYear());
        if(prevYear.getYear() > 1){
            prevYear.setYear(prevYear.getYear() - 1);
        }
        return prevYear;
    }
}
