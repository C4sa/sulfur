package sulfur_assets;

public class Color {
    // Create methods for every standard console color
    public static String Gray(String text) {
        return changeColor(text, 30);
    }

    public static String Red(String text) {
        return changeColor(text, 31);
    }

    public static String Green(String text) {
        return changeColor(text, 32);
    }

    public static String Yellow(String text) {
        return changeColor(text, 33);
    }

    public static String Blue(String text) {
        return changeColor(text, 34);
    }

    public static String Magenta(String text) {
        return changeColor(text, 35);
    }

    public static String Cyan(String text) {
        return changeColor(text, 36);
    }

    // Return a colored string with ANSI escape codes
    private static String changeColor (String msg, int colorID) {
        return "\033[1;" + colorID + "m" + msg + "\033[0m";
    }
}
