package com.epam.services;

public class DateValidatorServiceImpl implements DateValidatorService {
    @Override
    public int findDaysInMonth(byte month){
        return 28 + (month + month/8)%2 + 2 % month  + 2*(1/month);
    }

    @Override
    public boolean isYearLeap(int year){
        if(year % 4 != 0){
            return false;
        }else
        if(year % 100 == 0){
            return year % 400 == 0;
        }
        else
            return true;
    }
}
