public class Enum {
    public enum Color {
        RED, GREEN, BLUE;
    }

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    }

    public static void main(String[] args) {
        Color favoriteColor = Color.BLUE;
        System.out.println("My favorite color is: " + favoriteColor);

        for (Day day : Day.values()) {
            System.out.println("Day: " + day);
        }
    }

}
