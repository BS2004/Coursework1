import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Dec2Hex {
    private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());
    public static int Arg1;

    public static void main(String args[]) {
        if (args.length == 0) {
            logger.log(Level.SEVERE, "Error: No input argument provided. Ending Program.");
            return;
        }

        try {
            Arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            logger.log(Level.SEVERE, "Error: Non-integer input provided. Ending Program.");
            return;
        }

        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem, num;
        num = Arg1;
        String hexadecimal = "";

        logger.log(Level.INFO, "Converting the Decimal Value " + num + " to Hex...");

        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        logger.log(Level.INFO, "Hexadecimal representation is: ", hexadecimal);
    }
}
