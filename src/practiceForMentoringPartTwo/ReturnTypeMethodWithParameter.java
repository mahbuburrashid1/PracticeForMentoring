package practiceForMentoringPartTwo;

public class ReturnTypeMethodWithParameter {

    //Return Type Method With Parameter. also called dynamic return type method.
    //Return Type: All type of data,void, class type and Object
    // Rules of method Naming: verb+noun/Adjective
    // method name should state with lower case

    //Syntax of Return Type Method: AccessModifier Data Type/ void/ class/ object methodName(parameter){ return;    }


    public int doSummation(int firstNumber,int secondNumber) {
        int totalSumValue = firstNumber + secondNumber;
        System.out.println("this is my total value of summation= " + totalSumValue);
        return totalSumValue;  // Return key word should be end of the method
    }
    //==================================================================================================================
    public int doSubtraction(int firstNumber, int secondNumber) {
        int totalValueOfSub = firstNumber - secondNumber ;
        System.out.println("Total value of subtraction=  " + totalValueOfSub);
        return  totalValueOfSub;
    }
//==================================================================================================================
public int doMultiplication(int firstNumber, int secondNumber) {
    int totalValueOfMulti = firstNumber * secondNumber ;
    System.out.println("Total value of multiplication=  " + totalValueOfMulti);
    return  totalValueOfMulti;
}
//=============================================================================================================
public int doDivision(int firstNumber, int secondNumber) {
    int totalValueOfDivision = firstNumber / secondNumber;
    System.out.println("Total value of Division=  " + totalValueOfDivision);
    return totalValueOfDivision;
}
    //===============================Main Method===========================================
    public static void main(String[] args) {
        ReturnTypeMethodWithParameter parameterObj= new ReturnTypeMethodWithParameter();
        parameterObj.doSummation(500,200);
        parameterObj.doSubtraction(5000,2001);


       parameterObj.doMultiplication(50,20);
        parameterObj.doDivision(5000,20);



    }


}
