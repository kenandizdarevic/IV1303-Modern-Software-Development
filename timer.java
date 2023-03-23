import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Get the timezone
        ZoneId zone = ZoneId.systemDefault();

        // Get the current time in the timezone
        LocalDateTime currentTime = LocalDateTime.now(zone);

        // Format the current time as a string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = currentTime.format(formatter);

        // Print the current time in the timezone
        System.out.println("Current time in " + zone + " is " + formattedTime);
    }
}