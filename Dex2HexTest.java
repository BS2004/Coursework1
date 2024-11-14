import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dex2HexTest {

    public Dex2HexTest()
   {}
    Dec2Hex dec2Hex;

    @Before
    public void setUp() {
        dec2Hex = new Dec2Hex();
    }

	@Test
    void testValidIntegerInput() {

        String[] args = {"15"};
        Dec2Hex.main(args);
	}

	@Test
    void testNonIntegerInput() {

        String[] args = {"1.5"};
        Dec2Hex.main(args);
	}

	@Test
    void testNoIntegerInput() {

        String[] args = {""};
        Dec2Hex.main(args);
	}
}
