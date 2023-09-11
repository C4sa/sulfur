package sulfur_assets.commands;

import java.util.Scanner;

import sulfur_assets.Color;

public class ChangeName {
    public static void PromptNameChange() {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("To cancel, leave empty!");

            System.out.print("New display name: ");
            String displayNameInput = sc.nextLine();

            System.out.print("New username: ");
            String userNameInput = sc.nextLine();

            System.out.println(Color.Green("Successfully changed name to ") + Color.Blue(displayNameInput) + Color.Green(" with username " + Color.Yellow(userNameInput) + Color.Green("!")));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
