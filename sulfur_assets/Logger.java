package sulfur_assets;

public class Logger {
    public static void LogError (int errorTypeID, String other) {
        //String defaultErrorMessage = Color.Red(Messages.ERROR_PREFIX + Messages.ERROR_UNKNOWN);

        switch (errorTypeID) {
            // Invalid command
            case 0:
                System.out.println(FormatError(
                    String.format(Messages.ERROR_INVALID_COMMAND, other)
                    ));
                break;

            // Unfinished command
            case 1:
                System.out.println(FormatError(
                    String.format(Messages.ERROR_UNFINISHED_COMMAND, other)
                    ));
                break;

            // Default error (unknown)
            default:
                System.out.println(FormatError(
                    String.format(Messages.ERROR_UNKNOWN, other)
                    ));
        }
    }

    private static String FormatError (String message) {
        return Color.Red(Messages.ERROR_PREFIX + message);
    }
}
