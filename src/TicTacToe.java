import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        System.out.println("=== Welcome to Tic-Tac-Toe ===");

        do {
            initializeBoard();
            currentPlayer = 'X';
            boolean gameEnded = false;

            while (!gameEnded) {
                printBoard();
                playerMove(scanner);
                gameEnded = checkWinner();

                if (!gameEnded) {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            }

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = scanner.next().equalsIgnoreCase("y");

        } while (playAgain);

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    // Initialize empty board
    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Display the board
    private static void printBoard() {
        System.out.println("\nCurrent Board:");
        for (int i = 0; i < 3; i++) {
            System.out.printf(" %c | %c | %c \n", board[i][0], board[i][1], board[i][2]);
            if (i < 2) {
                System.out.println("---+---+---");
            }
        }
    }

    // Handle player move
    private static void playerMove(Scanner scanner) {
        int row, col;
        while (true) {
            System.out.printf("Player %c, enter your move (row and column 1-3): ", currentPlayer);
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter numbers.");
                scanner.next(); // consume invalid input
                continue;
            }

            row = scanner.nextInt() - 1;

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter numbers.");
                scanner.next(); // consume invalid input
                continue;
            }

            col = scanner.nextInt() - 1;

            if (row >= 0 && row < 3 && col >= 0 && col < 3) {
                if (board[row][col] == ' ') {
                    board[row][col] = currentPlayer;
                    break;
                } else {
                    System.out.println("That cell is already taken. Try again.");
                }
            } else {
                System.out.println("Invalid input. Enter row and column between 1 and 3.");
            }
        }
    }

    // Check win or draw
    private static boolean checkWinner() {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer &&
                board[i][1] == currentPlayer &&
                board[i][2] == currentPlayer) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                return true;
            }

            if (board[0][i] == currentPlayer &&
                board[1][i] == currentPlayer &&
                board[2][i] == currentPlayer) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                return true;
            }
        }

        if (board[0][0] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][2] == currentPlayer) {
            printBoard();
            System.out.println("Player " + currentPlayer + " wins!");
            return true;
        }

        if (board[0][2] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][0] == currentPlayer) {
            printBoard();
            System.out.println("Player " + currentPlayer + " wins!");
            return true;
        }

        // Check draw
        boolean draw = true;
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == ' ') {
                    draw = false;
                    break;
                }
            }
        }

        if (draw) {
            printBoard();
            System.out.println("It's a draw!");
            return true;
        }

        return false;
    }
}
