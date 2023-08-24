import com.sun.source.tree.CaseLabelTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Class[] lessons = new Class[3];
        Scanner input = new Scanner(System.in);

        int totalScore = 0;
        for(int i = 0; i < 3; i++){
            System.out.print("Enter name of the class: ");
            String title = input.next();

            System.out.print("Enter the score of class: ");
            int score = input.nextInt();

            lessons[i] = new Class(title, score );
            totalScore += lessons[i].score;
        }
        double average = totalScore / 3.0;

        for(int i = 0; i < 3; i++){
            System.out.print("Lesson: " + lessons[i].title);
            System.out.println(" - " + lessons[i].score);

        }

        System.out.println(average > 60 ? "You passed" : "You failed");
    }

    public static class Class {
        String title;
        int score;
        public Class(String title, int score) {
            this.title = title;
            this.score = score;
        }
    }

}

