import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        
        // Define quiz questions and answers
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            // Add more questions here...
        };
        String[] options = {
            "A) Paris\nB) London\nC) Berlin\nD) Madrid",
            "A) Venus\nB) Mars\nC) Jupiter\nD) Saturn",
            // Add more options here...
        };
        char[] correctAnswers = {'A', 'B', /* Add more correct answers here... */};
        
        // Display questions and get user input
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.println(options[i]);
            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = scanner.next().charAt(0);
            
            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was " + correctAnswers[i] + "\n");
            }
        }
        
        // Display final score
        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + "/" + questions.length);
    }
}