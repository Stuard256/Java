package com.epam.entity;

public class Date {

    private byte day;
    private byte month;
    private int year;

    public Date(byte day, byte month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public byte getDay() {
        return day;
    }

    public void setDay(byte day) {
        this.day = day;
    }

    public byte getMonth() {
        return month;
    }

    public void setMonth(byte month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
