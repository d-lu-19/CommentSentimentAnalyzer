import java.time.LocalDateTime;

public class JTimeDisplay {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        int hour = current.getHour();

        if (hour >= 21) {
            // Too late for work
            System.out.println("It's too late for work!");
        } else if (hour < 12) {
            // Good morning
            System.out.println("Good morning");
        } else {
            // Good day
            System.out.println("Have a good day!");
        }

        // Print the current date and time
        System.out.println("Current Date and Time is: " + current);
    }
}