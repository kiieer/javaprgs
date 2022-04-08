package com.revature.java8.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter; //Use this to format the output of any dates (See class for specifics)
import java.time.temporal.ChronoUnit; //The standard temporal units pre-defined for use.
import java.util.Date;
import java.util.Set;
/**
 * Using NEW Date and Time methods.
 *
 * Why use them? Older date/time:
 * - not thread safe
 * - difficult to use api
 * - no built in timezone logic
 */
public class DateandTime {
    public static void main(String[] args){
        localDateExamples();
        localTimeExamples();
        localDateTimeExample();
        timeZoneFun();
        workingWithOlderDates();
        System.out.println("\n--------End of Exploration of new Date/Time API in Java8!--------");
    }
  public static void localDateExamples(){
        System.out.println("______________LocalDate_____________");
        LocalDate nowHereDate = LocalDate.now(); //Grab my local date to account for time zone differences
        System.out.println("Now: "+nowHereDate);
        LocalDate simpleDate = LocalDate.of(2021,02,18); // Build the day this code was written
        System.out.println("Written on: "+simpleDate);
        //If I want tomorrow, I can simply add 1 to today's date
        LocalDate tomorrow = nowHereDate.plusDays(1);
        System.out.println("Tomorrow: "+tomorrow);
        //Same for month
        LocalDate nextMonth = nowHereDate.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: "+nextMonth);
        //You can also parse a date from a string
        String d = "2020-01-23"; //YYYY-MM-DD or DateTimePaseException is thrown
        LocalDate parsedDate = LocalDate.parse(d);
        System.out.println("Should say Thursday: "+parsedDate.getDayOfWeek()); //Show that string has been correctly parsed and that we can now get the day of the week from it.
    }
 public static void localTimeExamples(){
        System.out.println("______________LocalTime_____________");
        //Format
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm a");
        //Like date, but using time instead
        LocalTime nowTime = LocalTime.now();
        System.out.println("Current time: "+nowTime.format(format));
        //Can use factory method of to create datetime from hours and minutes
        LocalTime built = LocalTime.of(13,30);
        System.out.println("Should say 13:30 : "+built.format(format));
        //Can be incremented like dates using plus API
        LocalTime nextHour = nowTime.plus(1,ChronoUnit.HOURS);
        System.out.println("Next Hour: "+nextHour.format(format));
        //Check to see if next hour is before right now (false)
        System.out.println("Is "+nextHour.format(format)+" before "+nowTime.format(format)+" ? : "+nextHour.isBefore(nowTime));
    }
 public static void localDateTimeExample(){
        System.out.println("______________LocalDateTime_____________");
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mma");
        //A combo of the two above concepts!
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("The date and time right now: "+dt.format(f));
        //Adding and subtracting time can be accomplished using built in methods OR the plus method
        LocalDateTime tomorrowDateTime = dt.plusDays(1);
        System.out.println("Tomorrow "+tomorrowDateTime.format(f));
        LocalDateTime nextHour = dt.plus(1,ChronoUnit.HOURS);
        System.out.println("Next hour: "+nextHour.format(f));
    }
 public static void timeZoneFun(){
        System.out.println("______________TimeZones_____________");
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mma");
        //What about timezones?
        Set<String> available = ZoneId.getAvailableZoneIds(); //static method to provide us with all available timezones
        available.stream().limit(10).forEach(s -> System.out.println(s));
        System.out.println("And more...\n\n");
        //And you can convert your time to another
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime somewhereElse = ZonedDateTime.now(ZoneId.of("Africa/Nairobi"));
        System.out.println("Here.. "+now.format(f));
        System.out.println("Somewhere else... "+somewhereElse.format(f));
    }
public static void workingWithOlderDates(){
        System.out.println("______________Working with older Dates_____________");
        //Old dates
        Date d = new Date();
        System.out.println("Old date: "+d);
        //Convert to new
        //toInstant() method converts the old date for us
        LocalDateTime newDate = LocalDateTime.ofInstant(d.toInstant(),ZoneId.systemDefault());
        System.out.println("New date: "+newDate);
        ZonedDateTime zNew = ZonedDateTime.ofInstant(d.toInstant(),ZoneId.systemDefault());
        System.out.println("New Zoned date: "+zNew);
    }
}