package practiceForMentoringPartTwo;

public class ReturnTypeMethodWithOutParameter {

    //Return Type Method Without Parameter
    //Return Type: All type of data,void, class type and Object
    // Rules of method Naming: verb+noun/Adjective
    // method name should state with lower case

    //Syntax of Return Type Method: AccessModifier Data Type/ void/ class/ object methodName(){ return;    }

    public int doSum() {
        int firstNumber = 12;
        int secondNumber = 30;
        int totalSumValue = firstNumber + secondNumber;
        System.out.println("this is my total value of summation= " + totalSumValue);
        return totalSumValue;    // this totalSumValue is holding my all value and my return type is "int" so this "totalSumValue" variable is holding also int datatype.
    }
//   //===================================================================================================================
//    public byte doSummation() {
//        byte firstNumber1 = 10;
//        byte secondNumber2= 30;
//        byte thirdNumber3= 40;
//        byte forthNumber4= 50;
//        int totalValueOfSum = firstNumber1 + secondNumber2 + thirdNumber3 + forthNumber4;
//        System.out.println("Total value of summation= " + totalValueOfSum);
//        return (byte) totalValueOfSum;  // if my return type is "byte" dataType And this "totalValueOfSum" variable is holding int dataType, then we have to do casting
//    }
//    // =============================== changing or casting data type  ==================================================
//        public int doCasting() {
//        int num = 12;
//        int numb = 30;
//        byte total = (byte) (num + numb); // if my return type is "int" dataType And this "total" variable is holding byte dataType, then we have to do casting
//        System.out.println(total);
//        return total;
//    }
    //==================================================================================================================
    public double doSubtraction() {
        double firstNumber = 55555.5000;
        double secondNumber = 33333.5000;
        double totalSubValue = firstNumber - secondNumber;
        System.out.println("this is my total value of subtraction= " + totalSubValue);
        return totalSubValue;
    }
    //==================================================================================================================
    public int doMultiplication() {
        int firstNumber = 5000 ;
        int secondNumber = 25;
        int totalMultiValue= firstNumber*secondNumber;
        System.out.println("this is my total value of Multiplication= " + totalMultiValue);
        return totalMultiValue;
    }
    //==================================================================================================================
    public int doDivision() {
        int firstNumber = 100 ;
        int secondNumber = 25;
        int totalDivision= firstNumber/secondNumber;
        System.out.println("this is my total value of Division= " + totalDivision);
        return totalDivision;
    }
//    //==================================================================================================================
//    public String getYourName() {
//        String firstName= "Will";
//        String lastName= "Smith";
//        String FullName= firstName+" "+lastName ;
//        System.out.println("Your Full Name Is= " + FullName);
//        return FullName;
//    }
//    //==================================================================================================================
//    public boolean tomorrowIsOff() {
//        boolean tomorrowIsOff=true;
//        System.out.println("Office is off tomorrow ? "+"\n" +tomorrowIsOff);
//        return tomorrowIsOff;
//    }

    //==============================================Main Method ========================================================
    public static void main(String[] args) {
        //non-static method call by object name
        ReturnTypeMethodWithOutParameter myObject = new ReturnTypeMethodWithOutParameter();
        myObject.doSum();
       // myObject.doSummation();
        myObject.doSubtraction();
        //myObject.doCasting();
        myObject.doMultiplication();
        myObject.doDivision();
       // myObject.getYourName();
       // myObject.tomorrowIsOff();

    }


}
