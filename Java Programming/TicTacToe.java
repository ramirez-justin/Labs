public class TicTacToe {
    public static void main(String[] args) {
        runGame();
    }

    // The game loop
    public static void runGame() {
        String[][] gameBoard = new String[3][3];
        initializeGame(gameBoard);
        printCurrentBoard(gameBoard);
    }

    // Sets cells of 2D array to spaces
    public static void initializeGame(String[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = " ";
            }
        }
    }

    // Prints whatever is in the current board
    public static void printCurrentBoard(String[][] gameBoard) {
        System.out.printf(" %s | %s | %s\n", gameBoard[0][0], gameBoard[0][1], gameBoard[0][2]);
        System.out.println("- - - - - -");
        System.out.printf(" %s | %s | %s\n", gameBoard[0][0], gameBoard[0][1], gameBoard[0][2]);
        System.out.println("- - - - - -");
        System.out.printf(" %s | %s | %s\n", gameBoard[0][0], gameBoard[0][1], gameBoard[0][2]);

    }

    // gets the user input and if valid, sets the game board appropriately
    public static void getUserInput(boolean xTurn, String[][] gameBoard) {

    }

    // Returns true if a given cell, by row and column, is already full
    public static boolean cellAlreadyOccupied(int row, int col, String[][] gameBoard) {
        return false;
    }

    // Returns "X" or "O" if there is a clear winner, or " " if there is no winner
    public static String getWinner(String[][] gameBoard) {
        if () {

        } else if () {

        } else
            return " ";
    }

    public static boolean isBoardFull(String[][] gameBoard) {
        return false;
    }
}
