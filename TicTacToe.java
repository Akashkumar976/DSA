import java.util.Scanner;

public class TicTacToe {

    static char[][] board = new char[3][3];

    // Initialize the board with empty spaces
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Display the board
    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Check if any cell is empty
    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }

    // Check the winner
    public static char checkWinner() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' &&
                board[i][0] == board[i][1] &&
                board[i][1] == board[i][2])
                return board[i][0];
        }
        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] != ' ' &&
                board[0][i] == board[1][i] &&
                board[1][i] == board[2][i])
                return board[0][i];
        }
        // Check diagonals
        if (board[0][0] != ' ' &&
            board[0][0] == board[1][1] &&
            board[1][1] == board[2][2])
            return board[0][0];

        if (board[0][2] != ' ' &&
            board[0][2] == board[1][1] &&
            board[1][1] == board[2][0])
            return board[0][2];

        return ' '; // No winner yet
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Tic Tac Toe Game ===");

        boolean playAgain = true;

        while (playAgain) {
            initializeBoard();
            char currentPlayer = 'X';
            char winner = ' ';

            while (true) {
                printBoard();
                System.out.println("Player " + currentPlayer + ", enter row and column (0,1,2):");

                int row = sc.nextInt();
                int col = sc.nextInt();

                // Validate input
                if (row < 0 || row > 2 || col < 0 || col > 2) {
                    System.out.println("Invalid position! Try again.");
                    continue;
                }
                if (board[row][col] != ' ') {
                    System.out.println("Cell already taken! Try another.");
                    continue;
                }

                // Place the move
                board[row][col] = currentPlayer;

                // Check winner
                winner = checkWinner();
                if (winner != ' ') {
                    printBoard();
                    System.out.println("Player " + winner + " wins!");
                    break;
                }

                // Check draw
                if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    break;
                }

                // Switch player
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }

            // Ask for replay
            System.out.print("Play Again? (yes/no): ");
            String choice = sc.next();
            playAgain = choice.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        sc.close();
    }
}
