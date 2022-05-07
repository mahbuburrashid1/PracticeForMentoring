package practiceForMentoringPartTwo;

public class LearnLoop {


    // Loop: Loop is allowing us to execute a statement or group of statements multiple times


    public static void main(String[] args) {

        // For Loop


        for (int a = 0; a < 4; a++) {
            LearnLoop.doSum();
        }

    }


    public static void doSum() {
        int num1 = 5;
        int num2 = 7;
        int sum = num1 + num2;
        System.out.println("Summation value: " + sum);
    }


}
