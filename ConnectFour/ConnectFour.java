package ConnectFour;

import java.util.List;
import java.util.Map;

public class ConnectFour {
    private static Integer[][] board = new Integer[6][7];
    private static Character[] columns = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
    private static Integer turn = 0;
    private static Integer RED = 0;
    private static Integer YELLOW = 1;
    
    public static String whoIsWinner(List<String> piecesPositionList) {
        piecesPositionList.stream()
            .map(ConnectFour::parseMove)
            .forEach(ConnectFour::placePiece);
        for (Integer[] row : board) {
            for (Integer cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        return "Draw";
    }

    private static Map<Integer, Integer> parseMove(String string1) {
        String[] move = string1.split("_");
        Integer player = move[2].equals("Red") ? RED : YELLOW;
        Integer position = columns.toString().indexOf(move[0]);
        return Map.of(position, player);
    }

    private static void placePiece(Map<Integer, Integer> object1) {
        if (turn < 42) {
            Integer position = object1.keySet().iterator().next();
            Integer player = object1.values().iterator().next();
            Integer row = 5;
            while (board[row][position] != null) {
                row--;
            }
            board[row][position] = player;
            turn++;
        }
    }
    
}
