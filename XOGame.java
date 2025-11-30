import java.util.Scanner;

public class XOGame {

    static char board[][] = {
            {'1','2','3'},
            {'4','5','6'},
            {'7','8','9'}
    };

    // Print the board
    static void printBoard() {
        System.out.println("\n-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // Check winner
    static char checkWinner() {
        for (int i = 0; i < 3; i++) {
            // rows
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2])
                return board[i][0];
            // columns
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i])
                return board[0][i];
        }
        // diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return board[0][0];
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return board[0][2];

        return 'N';  // No winner
    }

    // Check if the board is full
    static boolean isDraw() {
        for (char[] row : board)
            for (char c : row)
                if (c >= '1' && c <= '9')
                    return false;
        return true;
    }

    // Put X or O
    static boolean putSymbol(int pos, char symbol) {
        int row = (pos - 1) / 3;
        int col = (pos - 1) % 3;

        if (board[row][col] == (char)(pos + '0')) {
            board[row][col] = symbol;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char currentPlayer = 'X';
        char winner = 'N';

        System.out.println("=== XO Game (Tic Tac Toe) ===");

        while (winner == 'N' && !isDraw()) {
            printBoard();
            System.out.print("Player " + currentPlayer + " enter position (1-9): ");
            int pos = sc.nextInt();

            if (pos < 1 || pos > 9) {
                System.out.println("Invalid position! Try again.");
                continue;
            }

            if (!putSymbol(pos, currentPlayer)) {
                System.out.println("Position already taken! Try again.");
                continue;
            }

            winner = checkWinner();

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        printBoard();

        if (winner != 'N')
            System.out.println("🎉 Player " + winner + " wins!");
        else
            System.out.println("It's a draw!");

        sc.close();
    }
}
