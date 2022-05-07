package practiceForMentoringPartTwo;

public class LearnConstructor {

    int age;
    String name;
    double salary;

    //default constructor
    public LearnConstructor(){
        System.out.println("hello");
        System.out.println("hello1");
        System.out.println("hello2");
        System.out.println("hello3");

    }
    //----------------------------------------------------
//single parameterized constructor
    public LearnConstructor(int age){
        this.age=age;   //purple color age is my variable and white color age is my value

        System.out.println("my age "+ age);

    }
    //--------------------------------------------------------------
//multi parameterized constructor
    public LearnConstructor(int age, String name){
        this.name = name ;
        this.age=age;
        System.out.println("my name is "+ name + " \n"+"my age is  " +age);

    }

    //--------------------------------------------------------------
//multi parameterized constructor
//    public LearnConstructor(int age, String name, double salary){
//        this.age = age ;
//        this.name = name ;
//        this.salary = salary ;
//        System.out.println("my name is " +name +"\n"+"my age is "+age +"\n"+"my salary is "+salary) ;
//    }

    public static void main(String[] args) {
        LearnConstructor obj=new LearnConstructor();
        LearnConstructor obj3=new LearnConstructor(33);


        LearnConstructor obj1=new LearnConstructor(44,"michel");
       // LearnConstructor obj2=new LearnConstructor(55,"david",5000.00);

    }




}
