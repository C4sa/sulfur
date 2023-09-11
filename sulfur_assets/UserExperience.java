package sulfur_assets;
import java.time.LocalTime;

public class UserExperience {
    public static void GreetUser() {
        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Define time ranges
        LocalTime morningStart = LocalTime.of(6, 0);
        LocalTime afternoonStart = LocalTime.of(12, 0);
        LocalTime eveningStart = LocalTime.of(18, 0);

        // Greet the user based on their current time
        if (currentTime.isAfter(morningStart) && currentTime.isBefore(afternoonStart)) {
            System.out.println(Messages.GREETING_MORNING);
        } else if (currentTime.isAfter(afternoonStart) && currentTime.isBefore(eveningStart)) {
            System.out.println(Messages.GREETING_AFTERNOON);
        } else {
            System.out.println(Messages.GREETING_EVENING);
        }
    }
}
