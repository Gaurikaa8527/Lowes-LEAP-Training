package employee;

public class Test {
    public static void main(String[] args) {
        
        Employee e = new Employee(901, "Gaurikaa", 80000);
        float e_gross = e.compute_gross(80000);
        System.out.println(e_gross);

        if(e_gross >= 25000){
            System.out.println("class A employee");
        }else if(e_gross < 25000 && e_gross >= 10000){
            System.out.println("class B employee");
        }else{
            System.out.println("class C employee");
        }
    }
}
