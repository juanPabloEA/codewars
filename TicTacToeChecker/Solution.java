package TicTacToeChecker;



public class Solution {

    private static final Integer X_WON = 1;
    private static final Integer O_WON = 2;
    private static final Integer INCOMPLETE = -1;
    private static final Integer DRAW = 0;
    
    private static final Integer EMPTY = 0;
    private static final Integer X = 3;
    private static final Integer O = 6;

    private static Boolean isIncompleteGlob = false;
    private static Boolean isIncomplete = false;


    public static int isSolved(int [][] board) {
        try {

            // evaluate row and col

            for (int row = 0; row < 3; row++) {
                eval(isValidate(board[row][0]) + isValidate(board[row][1]) + isValidate(board[row][2]));
            }
            for (int col = 0; col < 3; col++) {
                eval(isValidate(board[0][col]) + isValidate(board[1][col]) + isValidate(board[2][col]));
            }

            // evaluate diag and invert diag
            eval(isValidate(board[0][0]) + isValidate(board[1][1]) + isValidate(board[2][2]));
            eval(isValidate(board[0][2]) + isValidate(board[1][1]) + isValidate(board[2][0]));

        } catch (Exception e) {
            if ( Integer.valueOf(e.getMessage()) == X_WON ) {
                return X_WON;
            }
            if ( Integer.valueOf(e.getMessage()) == O_WON ) {
                return O_WON;
            }
        }
        
        return Boolean.TRUE.equals(isIncompleteGlob) ? INCOMPLETE : DRAW;
    }

    private static Integer isValidate(Integer val) {
        if (EMPTY.equals(val)) {
            isIncompleteGlob = true;
            isIncomplete = true;
        }
        return val;
    }
    private static void eval(Integer val) throws Exception {
        if (X.equals(val) && !isIncomplete) {
            throw new Exception(String.valueOf(X_WON), null);
        }
        if (O.equals(val) && !isIncomplete) {
            throw new Exception(String.valueOf(O_WON), null);
        }
        isIncomplete = false;
    }
}