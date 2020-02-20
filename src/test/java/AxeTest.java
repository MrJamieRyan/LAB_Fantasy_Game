import Attacks.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    private Axe axe;

    @Before
    public void setUp() throws Exception {
        axe = new Axe("Axe of Thalos", 20);
    }

    @Test
    public void canGetDamage() {
        assertEquals(20, axe.getDamage(), 0.01);
    }
}
