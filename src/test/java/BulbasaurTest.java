import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pokemon.Bulbasaur;
import pokemon.Pikachu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BulbasaurTest {
    Bulbasaur bulbasaur;
    @BeforeEach
    void setUp(){
        bulbasaur = new Bulbasaur(200);
    }

    @Test
    void attackOneTestGivenFirstAttack(){
        int expected = 150;
        int actual = bulbasaur.attackOne(bulbasaur).getHealth();
        assertEquals(expected, actual);
    }

    @Test
    void attackTwoTestGivenFirstAttack(){
        int expected = 160;
        int actual = bulbasaur.attackTwo(bulbasaur).getHealth();
        assertEquals(expected, actual);
    }

    @Test
    void attackThreeTestGivenFirstAttack(){
        int expected = 180;
        int actual = bulbasaur.attackThree(bulbasaur).getHealth();
        assertEquals(expected, actual);
    }
    @Test
    void attackFourTestGivenFirstAttack(){
        int expected = 165;
        int actual = bulbasaur.attackFour(bulbasaur).getHealth();
        assertEquals(expected, actual);
    }


}
