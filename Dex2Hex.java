import java.util.Scanner;

public class Dex2Hex {
    public static String dexToHexConversion(String[] args) {
        if (args.length == 0) {
            return "Error: No input argument provided. Ending Program.";
        }

        int num;
        try {
            num = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            return "Error: Non-integer input provided. Ending Program.";
        }

        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexadecimal = "";
        int rem;

        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        return "Converting the Decimal Value " + args[0] + " to Hex...\n" +
               "Hexadecimal representation is: " + hexadecimal;
    }

    public static void main(String[] args) {
        System.out.println(dexToHexConversion(args));
    }
}
