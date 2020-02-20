import Fighter.Knight;
import org.junit.Before;

public class KnightTest {

    private Knight knight;

    @Before
    public void before(){
        knight = new Knight("Lancelot", 100);
    }
}
