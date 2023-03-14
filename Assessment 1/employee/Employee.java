package employee;

class Employee{
    
    int emp_id;
    String emp_Name;
    float basic_sal;
    float hra = (12*basic_sal)/100;
    float ta = (8*basic_sal)/100;
    float da = (9*basic_sal)/100;
    float gross = basic_sal+hra+ta+da;

    public Employee(int i, String string, int j) {
    }

    void Employee(int a, String b, float c){
        this.emp_id = a;
        this.emp_Name = b;
        this.basic_sal = c;
    }

    float compute_gross(float basic_sal){

        float hra = (12*basic_sal)/100;
        float ta = (8*basic_sal)/100;
        float da = (9*basic_sal)/100;
        float gross = basic_sal+hra+ta+da;

        System.out.println("Your gross is: " + gross);
        return gross;
        
    }

}