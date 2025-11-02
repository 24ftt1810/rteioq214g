import java.util.*;

public class TicTacToeWithComputer {
    static char[][] board = new char[3][3];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Arrays.fill(board[i], ' ');
        }

        boolean playerTurn = true;
        boolean gameEnded = false;

        while (!gameEnded) {
            printBoard();

            if (playerTurn) {
                System.out.println("\nPlayer's turn");
                int row, column;
                while (true) {
                    System.out.print("Enter a row (0,1 or 2): ");
                    row = input.nextInt();
                    System.out.print("Enter a column (0,1 or 2): ");
                    column = input.nextInt();
                    if (row >= 0 && row < 3 && column >= 0 && column < 3 && board[row][column] == ' ') {
                        board[row][column] = 'X';
                        break;
                    } else {
                        System.out.println("Invalid move, try again.");
                    }
                }
            } else {
                System.out.println("\nCPU's turn...");
                int row, column;
                while (true) {
                    row = (int) (Math.random() * 3);
                    column = (int) (Math.random() * 3);
                    if (board[row][column] == ' ') {
                        board[row][column] = 'O';
                        break;
                    }
                }
            }

            if (checkWin('X')) {
                printBoard();
                System.out.println("\nGame ended, Player Win");
                gameEnded = true;
            } else if (checkWin('O')) {
                printBoard();
                System.out.println("\nGame ended, CPU Win");
                gameEnded = true;
            } else if (isBoardFull()) {
                printBoard();
                System.out.println("\nGame ended, It's a draw!");
                gameEnded = true;
            } else {
                playerTurn = !playerTurn;
            }
        }
    }

    static boolean checkWin(char player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player))
                return true;
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("---------");
        }
    }
}
