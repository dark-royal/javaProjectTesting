import TicTacToePackage.InvalidPlayerAndInvalidPlayerPosition;
import TicTacToePackage.TacConstant;
import TicTacToePackage.TicTacToe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

    private TicTacToe ticTacToe;

    @BeforeEach
    public void initializer(){
        ticTacToe = new TicTacToe();


    }

    @Test
    public void testGameExist(){
        assertNotNull(ticTacToe);
    }

    @Test
    public void testThatGameHave3by3DimensionalArray(){
        assertNotNull(ticTacToe.checkTable());
    }
    @Test
   public void testThatBoardCanBeInitializeToEmpty(){
        TacConstant[][] actual = ticTacToe.checkTable();
        System.out.println(Arrays.deepToString(actual));
        TacConstant[][] expected = new TacConstant[3][3];
        for (TacConstant[] tacConstants : expected) {
            Arrays.fill(tacConstants, TacConstant.EMPTY);
        }
        assertArrayEquals(actual,expected);
    }

    @Test
    public void testThatGameHaveTwoPlayers(){
        assertEquals(2,ticTacToe.getNumberOfPlayer());
    }

    @Test
    public void testThatPlayerCanPlayAtPosition1(){
        ticTacToe.play(1,1);
        assertEquals(TacConstant.X,ticTacToe.checkTable()[0][0]);
    }

    @Test
    public void testThatPlayerCanPlayInPositionTwo(){
        ticTacToe.play(1,2);
        assertEquals(TacConstant.X,ticTacToe.checkTable()[0][1]);
    }

    @Test
    public void testThatPlayerCanPlay2CanPlayAtPosition1(){
        ticTacToe.play(2,2);
        assertEquals(TacConstant.O,ticTacToe.checkTable()[0][1]);
    }

    @Test
    public void testThatPlayerCanOnlyBeTwo(){
        assertThrows(InvalidPlayerAndInvalidPlayerPosition.class,()-> ticTacToe.play(3,10));
    }

    @Test
    public void testThatPlayerCannotPlayInTheSameIndexThatHaveBeenPlayed(){
        ticTacToe.play(1,2);
        assertEquals(TacConstant.X,ticTacToe.checkTable()[0][1]);
        assertThrows(IllegalArgumentException.class,()-> ticTacToe.play(1,2));
    }
}
