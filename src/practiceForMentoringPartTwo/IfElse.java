package practiceForMentoringPartTwo;

import java.util.Scanner;

public class IfElse {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = input.nextInt();
        if (score > 94) {
            System.out.println("your score is excellent");
        } else if (score >= 85 && score <= 89) {
            System.out.println("your score is  good");
        } else if (score >= 80 && score <= 84) {
            System.out.println("your score is average");

        } else if (score >= 50 && score <= 59) {
            System.out.println("need to repeat the course");
        }



        input.close();
}
}