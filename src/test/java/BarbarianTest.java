import Fighter.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Conan", 150);
    }

    @Test
    public void getName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(150, barbarian.getHealth(), 0.01);
    }



}
