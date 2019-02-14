package janJavaProgramming.week11.ex1;

import java.time.*;
import java.time.format.DateTimeFormatter;
public class MugatuTimetableApplication {

    public static void main(String[] args) {


        LocalTime wakeUpTime = LocalTime.parse("10:00:00");
        LocalDate startDate = LocalDate.parse("2003-03-13");
        LocalDateTime start = LocalDateTime.of(startDate , wakeUpTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String startingTime = start.format(formatter);
        System.out.println(startingTime);
        System.out.println("Mugatu had woken up at: " + formatter.format(start) + " on " + startDate.getDayOfWeek());

        LocalDateTime isReadyTime = start.plusMinutes(37).plusSeconds(21);
        System.out.println("Mugatu is ready at: " + formatter.format(isReadyTime));

        LocalDateTime arrivedAtAirport = isReadyTime.plusHours(1).plusMinutes(30);
        System.out.println("he arrived at the airport at: " + formatter.format(arrivedAtAirport));


        LocalTime flight = LocalTime.parse("11:04:00");
        LocalDateTime firstflight = LocalDateTime.of(startDate,flight);
        System.out.println("has Mugatu missed the flight ?" + arrivedAtAirport.isBefore(firstflight));

        LocalTime nextFlightTime = LocalTime.parse("18:45:00");
        LocalDateTime nextFlight = LocalDateTime.of(startDate, nextFlightTime);

        Duration duration = Duration.between(arrivedAtAirport, nextFlight);

        System.out.println("The time Mugatu has to wait is the total of: " + duration.toHours() + " hours and " + duration.toMinutes()%60 + " Minutes");
        System.out.println("Magutu entered the plane at: " +formatter.format(nextFlight));



        LocalDateTime timeOfArrivalInLondon = LocalDateTime.of(startDate, nextFlightTime.plusHours(11).plusMinutes(50));
        System.out.println("Available zones: " + ZoneId.getAvailableZoneIds());
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime timeOfArrivalTokyo = timeOfArrivalInLondon.atZone(tokyo);

        System.out.println("Magutu arrived at Tokyo airpot at: " + formatter.format(timeOfArrivalInLondon) + " London time, and at " + formatter.format(timeOfArrivalTokyo));

    }
}
