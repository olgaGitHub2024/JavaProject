package school.lesson3_3;

import java.time.LocalTime;

public class Park {

    private Attraction[] attractions;

    public void setAttractions(Attraction[] attractions) {
        this.attractions = attractions;
    }

    public void printAttractions() {
        if (attractions != null) {
            for (Attraction attraction: attractions) {
                System.out.println("Аттракцион '"+ attraction.getName()+ "' работает с " + attraction.getTimeFrom() +
                        " до " + attraction.timeTo + " и стоит " + attraction.getCost());
            }
        }
    }

    public static class Attraction {

        private String name;
        private LocalTime timeFrom;
        private LocalTime timeTo;
        private double cost;

        public Attraction(String name, LocalTime timeFrom, LocalTime timeTo, double cost) {
            this.name = name;
            this.timeFrom = timeFrom;
            this.timeTo = timeTo;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public LocalTime getTimeFrom () {
            return timeFrom;
        }

        public LocalTime getTimeTo () {
            return timeTo;
        }

        public double getCost () {
            return cost;
        }
    }
}
