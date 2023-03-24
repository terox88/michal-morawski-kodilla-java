package com.kodilla.patterns.enums.hotel;

public class HotelApp {
    public static void main(String[] args) {
        System.out.println("Accommodation prices:");
        System.out.println("1. Single Bed rooms");
        System.out.println("   - low season:" + Season.LOW.getSingleBedPrice());
        System.out.println("   - high season:" + Season.HIGH.getSingleBedPrice());
        System.out.println("   - holiday season:" + Season.HOLIDAY.getSingleBedPrice());
        System.out.println("2. Double Bed rooms");
        System.out.println("   - low season:" + Season.LOW.getDoubleBedPrice());
        System.out.println("   - high season:" + Season.HIGH.getDoubleBedPrice());
        System.out.println("   - holiday season:" + Season.HOLIDAY.getDoubleBedPrice());

        Season season = Season.HOLIDAY;
        System.out.println(season);
    }

}
