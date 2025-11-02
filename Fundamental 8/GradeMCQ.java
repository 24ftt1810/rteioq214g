import java.util.Scanner;

public class GradeMCQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D'},
            {'D', 'B', 'A', 'B', 'B', 'A'},
            {'E', 'D', 'D', 'A', 'B', 'A'},
            {'C', 'B', 'A', 'E', 'B', 'A'}
        };
        System.out.println("Enter the key to the MCQ: ");
        char[] key = new char[6];
        for (int i = 0; i < key.length; i++) {
            key[i] = input.next().charAt(0);
        }

        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == key[j]) {
                    correctCount++;
                }
            }
            String result = (correctCount >= 3)
                    ? "passed the test."
                    : "failed the test.";

            System.out.println("Student " + i + "'s correct count is " + correctCount +
                    ". Therefore, he/she " + result);
        }
    }
}
