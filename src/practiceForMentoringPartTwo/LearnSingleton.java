package practiceForMentoringPartTwo;

public class LearnSingleton {

//    String myaName;
//    double mySalary;


    //default private constructor
    private LearnSingleton() {


        System.out.println(" this is my singleton practice");

    }

    private static LearnSingleton myObjectName = new LearnSingleton();


    public static LearnSingleton myMethod() {

        return myObjectName;
    }


}





