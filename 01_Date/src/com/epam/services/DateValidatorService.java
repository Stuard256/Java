package com.epam.services;

public interface DateValidatorService {
    boolean isYearLeap(int year);
    int findDaysInMonth(byte month);
}
