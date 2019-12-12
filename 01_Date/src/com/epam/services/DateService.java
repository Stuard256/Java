package com.epam.services;

import com.epam.entity.Date;

public interface DateService {
    void showDate(Date date);
    Date getNextDay(Date date);
    Date getPrevDay(Date date);
    Date getNextMonth(Date date);
    Date getPrevMonth(Date date);
    Date getNextYear(Date date);
    Date getPrevYear(Date date);
}
