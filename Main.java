import java.util.Scanner;
import sulfur_assets.Color;
import sulfur_assets.Logger;
import sulfur_assets.Messages;
import sulfur_assets.UserExperience;

class Main {
    public static void main(String[] args) {
        // Greetings!
        UserExperience.GreetUser();

        // 'try-catch' to avoid resource leaks
        try(Scanner sc = new Scanner(System.in)) {
            while(true) {
                System.out.print(Messages.CONSOLE_PROMPT);
                String rawInput = sc.nextLine();

                // Split the input into arguments
                String[] arguments = rawInput.split("\\s+");

                if (arguments.length == 0) {
                    continue;
                } else {
                    String command = arguments[0];

                    // Commands
                    switch (command) {
                        case "dev":
                            System.out.println(Color.Cyan("Dev command!"));
                            break;

                        case "echo":
                           System.out.println(Color.Green(Messages.ECHO_WIP));
                           break;
                            
                        case "":
                            break;

                        default:
                            Logger.LogError(0, rawInput);
                            break;
                    }
                }                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void function () {

    }
}