import Attacks.IWeapon;
import Fighter.Barbarian;
import Fighter.Dwarf;
import Fighter.Knight;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    private Dwarf dwarf;
    private Barbarian barbarian;
    private Knight knight;
    private IWeapon weapon;

    @Before
    public void before(){
        dwarf = new Dwarf("Gimly",  50, "Axe" );
        knight = new Knight("Lancelot", 100, "Sword");
        barbarian = new Barbarian("Conan", 150, "Club");
        weapon = new Weapon("Axe");
    }

    @Test
    public void getDwarfName() {
        assertEquals("Gimly", dwarf.getName());
    }

    @Test
    public void getKnightName() {
        assertEquals("Lancelot", knight.getName());
    }

    @Test
    public void getBarbarianName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void getDwarfHealth() {
        assertEquals(50 , dwarf.getHealth());
    }

    @Test
    public void getKnightHealth() {
        assertEquals(100 , knight.getHealth());
    }

    @Test
    public void getBarbarianHealth() {
        assertEquals(150 , barbarian.getHealth());
    }

    @Test
    public void getDwarfWeapon() {
        assertEquals("Axe" , dwarf.getWeapon(weapon));
    }

//    @Test
//    public void getKnightWeapon() {
//        assertEquals("Sword" , knight.getWeapon());
//    }
//
//    @Test
//    public void getBarbarionWeapon() {
//        assertEquals("Club" , barbarian.getWeapon());
//    }



}



