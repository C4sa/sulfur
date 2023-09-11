import java.util.Arrays;
import java.util.Scanner;
import sulfur_assets.Color;
import sulfur_assets.Logger;
import sulfur_assets.Messages;
import sulfur_assets.UserExperience;
import sulfur_assets.commands.Echo;
import sulfur_assets.commands.ChangeName;

class Main {
    public static void main(String[] args) {
        // Greetings!
        UserExperience.GreetUser();

        // 'try-catch' to avoid resource leaks
        try(Scanner sc = new Scanner(System.in)) {
            while(true) {
                System.out.print(String.format(Messages.CONSOLE_PROMPT, "Guest".toLowerCase()));
                String rawInput = sc.nextLine();

                // Split the input into arguments
                String[] arguments = rawInput.split("\\s+");

                if (arguments.length == 0) {
                    continue;
                } else {
                    String command = arguments[0];                    

                    // Commands
                    switch (command) {
                        case "echo":
                            String[] passedArgs = Arrays.copyOfRange(arguments, 1, arguments.length);

                            Echo.EchoMessage(passedArgs);
                            break;

                        case "changename":
                            ChangeName.PromptNameChange();
                            
                        case "":
                            break;

                        case "exit":
                            System.out.println(Color.Yellow("Exiting with code 0"));
                            System.exit(0);
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
}