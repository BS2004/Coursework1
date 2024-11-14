import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {

    public Dex2HexTest()
   {}
    Dec2Hex dec2Hex;

    @Before
    public void setUp() {
        dec2Hex = new Dec2Hex();
    }

	@Test
   public void testValidIntegerInput() {

        String[] args = {"15"};
        Dec2Hex.main(args);
	}

	@Test
    public void testNonIntegerInput() {

        String[] args = {"1.5"};
        Dec2Hex.main(args);
	}

	@Test
    public void testNoIntegerInput() {

        String[] args = {};
        Dec2Hex.main(args);
	}
}
