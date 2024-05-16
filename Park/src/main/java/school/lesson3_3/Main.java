package school.lesson3_3;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Park park = new Park();
        Park.Attraction[] attractions = new Park.Attraction[2];
        Park.Attraction attraction1 = new Park.Attraction("Колесо обозрения", LocalTime.of(9, 0),
                LocalTime.of(21, 30), 500.99);
        Park.Attraction attraction2 = new Park.Attraction("Американские горки", LocalTime.of(8, 0),
                LocalTime.of(18, 0), 750.99);
        attractions[0] = attraction1;
        attractions[1] = attraction2;
        park.setAttractions(attractions);
        park.printAttractions();
    }
}
