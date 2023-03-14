package inhertanceimplementation;
public class Inheritance {

    //Three types of inheritance: Single, Multilevel, Multiple

    //Single Inheritance
    public class Employee{
        int salary = 50000;
    }

    public class Engineer extends Employee{
        int allowances = 20000;
    }

    //multilevel inheritance: inheriting a class that inherits another class
    public class SeniorEngineer extends Engineer{
        int seniorallowances = 40000;
    }

    
    
    public static void main(String[] args){
    }

    
}
