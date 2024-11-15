import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class Dex2HexTest {

    @Test
    public void testValidIntegerInput() {
        String[] args = {"15"};
        String result = Dex2Hex.dexToHexConversion(args);
        String expected = "Converting the Decimal Value 15 to Hex...\n" +
                          "Hexadecimal representation is: F";
        assertEquals(expected, result);
    }

    @Test
    public void testNonIntegerInput() {
        String[] args = {"1.5"};
        String result = Dex2Hex.dexToHexConversion(args);
        String expected = "Error: Non-integer input provided. Ending Program.";
        assertEquals(expected, result);
    }

    @Test
    public void testNoIntegerInput() {
        String[] args = {};
        String result = Dex2Hex.dexToHexConversion(args);
        String expected = "Error: No input argument provided. Ending Program.";
        assertEquals(expected, result);
    }
}
