import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class CheckPassword {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private CheckPassword() {
    }

    /**
     * Checks whether the given String satisfies the OSU criteria for a valid
     * password. Prints an appropriate message to the given output stream.
     *
     * @param s
     *            the String to check
     * @param out
     *            the output stream
     */
    private static void checkPassword(String s, SimpleWriter out) {
        int index = (containsUpperCaseLetter(s)) ? 1 : 0;
        index += (containsLowerCaseLetter(s)) ? 1 : 0;
        index += (containsDigit(s)) ? 1 : 0;
        index += (containsChar(s)) ? 1 : 0;
        out.println((index >= 3 && s.length() >= 8) ? "Password meets criteria"
                : "Password doesn't meet criteria");

    }

    /**
     * Checks if the given String contains an upper case letter.
     *
     * @param s
     *            the String to check
     * @return true if s contains an upper case letter, false otherwise
     */
    private static boolean containsUpperCaseLetter(String s) {
        boolean val = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                val = true;
            }
        }
        return val;
    }

    /**
     * Checks if contains digit.
     *
     * @param s
     *            the string to check
     *
     * @return true if s contains an digit, false otherwise
     */
    private static boolean containsDigit(String s) {
        boolean val = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                val = true;
            }
        }
        return val;
    }

    /**
     * Checks if contains lower case letter.
     *
     * @param s
     *            the string to check
     *
     * @return true if s contains a lower case letter, false otherwise
     */
    private static boolean containsLowerCaseLetter(String s) {
        boolean val = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                val = true;
            }
        }
        return val;
    }

    /**
     * Checks if contains special character.
     *
     * @param s
     *            the string to check
     *
     * @return true if s contains a special character, false otherwise
     */
    private static boolean containsChar(String s) {
        char[] digits = { ' ', '!', '"', '#', '$', '%', '&', '\'', '(', ')',
                '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@',
                '[', '\\', ']', '^', '_', '`', '{', '|', '}', '~' };
        boolean val = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < digits.length; j++) {
                if (digits[j] == s.charAt(i)) {
                    val = true;
                }
            }
        }
        return val;
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();
        out.println("Input a password: ");
        String pw = in.nextLine();
        checkPassword(pw, out);

        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
