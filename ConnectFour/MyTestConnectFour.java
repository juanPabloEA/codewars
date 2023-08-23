package ConnectFour;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MyTestConnectFour {
    public static void main(String[] args) {
        MyTestConnectFour test = new MyTestConnectFour();
        test.firstTest();
        test.secondTest();
        test.thirdTest();
    }
    public void firstTest()
    {
        List<String> myList = new ArrayList<String>(Arrays.asList(
            "A_Red",
            "B_Yellow",
            "A_Red",
            "B_Yellow",
            "A_Red",
            "B_Yellow",
            "G_Red",
            "B_Yellow"
        ));
        assertEquals("it should return Yellow", "Yellow", ConnectFour.whoIsWinner(myList));
    }

    private void assertEquals(String string, String string2, String whoIsWinner) {
        System.out.printf("message: %s, result: %B", string, whoIsWinner == "Yellow");
    }

    public void secondTest()
    {
        List<String> myList = new ArrayList<String>(Arrays.asList(
            "C_Yellow",
            "E_Red",
            "G_Yellow",
            "B_Red",
            "D_Yellow",
            "B_Red",
            "B_Yellow",
            "G_Red",
            "C_Yellow",
            "C_Red",
            "D_Yellow",
            "F_Red",
            "E_Yellow",
            "A_Red",
            "A_Yellow",
            "G_Red",
            "A_Yellow",
            "F_Red",
            "F_Yellow",
            "D_Red",
            "B_Yellow",
            "E_Red",
            "D_Yellow",
            "A_Red",
            "G_Yellow",
            "D_Red",
            "D_Yellow",
            "C_Red"
        ));
        assertEquals("it should return Yellow", "Yellow", ConnectFour.whoIsWinner(myList));
    }

    public void thirdTest()
    {
        List<String> myList = new ArrayList<String>(Arrays.asList(
            "A_Yellow",
            "B_Red",
            "B_Yellow",
            "C_Red",
            "G_Yellow",
            "C_Red",
            "C_Yellow",
            "D_Red",
            "G_Yellow",
            "D_Red",
            "G_Yellow",
            "D_Red",
            "F_Yellow",
            "E_Red",
            "D_Yellow"
        ));
        assertEquals("it should return Red", "Red", ConnectFour.whoIsWinner(myList));
    }
}
