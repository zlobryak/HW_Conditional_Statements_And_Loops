package ru.ntology.service;

public class LeapYearCalc {
    public static final int Leap_Year = 366;
    public static final int Normal_Year = 365;

    public static int leapYearCalc(int year) {
        if(year % 400 == 0){
            return Leap_Year;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return Leap_Year;
        }
        return Normal_Year;
    }
}
