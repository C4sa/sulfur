package sulfur_assets.commands;

public class Echo {
    public static void EchoMessage(String[] inputArgs) {
        for (int i = 0; i < inputArgs.length; i++) {
            System.out.print(inputArgs[i] + " ");
        }
        System.out.println();
    }
}
