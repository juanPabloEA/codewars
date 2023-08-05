
public class Main {
    public static void main(String[] args) {
        Integer res = TicTacToeChecker.Solution.isSolved(new int[][] {
            {1, 2, 2},
            {2, 1, 1},
            {1, 1, 2}
        });
        System.out.printf("res: %s\n", res);
    }
}