import Fighter.Dwarf;
import org.junit.Before;

public class DwarfTest {

    private Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Gimly",  50);
    }
}
