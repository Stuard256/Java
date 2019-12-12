package com.epam.validator;

import java.util.List;
import java.util.Scanner;

import com.epam.entity.Date;
import com.epam.services.DateValidatorServiceImpl;

public class DateValidator {

    DateValidatorServiceImpl service = new DateValidatorServiceImpl();

    public void readInput(List<Date> dateList) throws java.util.InputMismatchException {

        byte day;
        byte month;
        int year;

        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.println("Please input your date:");

            System.out.print("Day: ");
            day = scanner.nextByte();

            System.out.print("Month: ");
            month = scanner.nextByte();

            System.out.print("Year: ");
            year = scanner.nextInt();

            if(validate(day,month,year)){

                dateList.add(new Date(day,month,year));
                System.out.println("Date saved!");

            }
        }
        catch (java.util.InputMismatchException e){
            System.err.println(e.getMessage());
        }

    }

    public boolean validate(byte day,byte month,int year)
    {
        if( year > 0  && year < Integer.MAX_VALUE) {
            if (service.isYearLeap(year)) {
                if (month >= 1 && month <= 12) {
                    if(month == 2){
                        if(day >= 1 && day <= 29){
                            return true;
                        }
                        else
                            System.out.println("Day must be between 1 and 29");
                            return false;
                    }
                    else{
                        if(day >= 0 && day <= service.findDaysInMonth(month)){
                            return true;
                        }
                        else
                            System.out.println("Day must be between 1 and " + service.findDaysInMonth(month));
                        return false;
                    }
                }
                else
                    System.out.println("Month must be between 1 and 12");
                    return false;
            }
            else
            {
                if (month >= 1 && month <= 12) {
                    if(day >= 0 && day <= service.findDaysInMonth(month)){
                        return true;
                    }
                    else
                        System.out.println("Day must be between 1 and " + service.findDaysInMonth(month));
                        return false;
                }
                else
                    System.out.println("Month must be between 1 and 12");
                    return false;
            }
        }
        else
            System.out.println("Year must be between 1 and MAX_INT");
            return false;
    }
}
