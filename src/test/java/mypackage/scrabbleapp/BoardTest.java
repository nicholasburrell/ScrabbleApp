package mypackage.scrabbleapp;

//import org.junit.Test;
import org.junit.*;

public class BoardTest {

    @Test
    public void testBoardPrintBasic(){
        Board myBoard = new Board();
//        System.out.println(myBoard);
        String expectedEmptyBoardString = "[---------------]\n[---------------]\n[---------------]\n[---------------]\n[---------------]\n[---------------]\n[---------------]\n[---------------]\n[---------------]\n[---------------]\n[---------------]\n[---------------]\n[---------------]\n[---------------]\n[---------------]\n";
        Assert.assertEquals(expectedEmptyBoardString, myBoard.toString());
    }

}
