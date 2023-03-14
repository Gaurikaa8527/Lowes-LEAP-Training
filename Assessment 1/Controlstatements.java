class Controlstatement{
    public static void main(String []args){
        //************if-else block*****************************************
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        //let's compute whether a is bigger or b
        if(a > b){
            System.out.println("I'm printing from the if-block and 'a' is bigger than 'b'");
        }else if(b > a){
            System.out.println("I'm printing from the if-else--block and 'b' is bigger than 'a'");
        }else{
            System.out.println("I'm printing from the else-block and 'a' is equal to 'b'");
        }

        //**********Switch case*********************************************
        //printing out what day it is(1: Mon, 2: Tues and so on)

        int c = Integer.parseInt(args[2]);
        switch (c) {
            case 1:
                System.out.println("Monday");
                break;  //break statement is used to break a code block once a task is performed and we no longer need it

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Please enter a number between 1 & 7 only");
                break;
        }

        System.out.println("Enter a positive number:");
        int i = Integer.parseInt(args[3]);
        //implementing while, do-while and for loop for same problem  printing in decreasing order.

        //while loop
        while(i >= 0){
            System.out.println(i);
            i--;
        }

        //do-while loop
        do{
            System.out.println(i);
            i--;
        }while(i>=0);

        //for loop
        for(;i >=0; i--){
            System.out.println(i);
        }

        /*break and continue statement:
         * break: used to exit a block of code: implementation shown in switch case
         * continue: used to skip current iteration of a loop and not the code block
        */

        //continue implementation:

        //Eg: we need to print numbers from 1 to 10 and skip 7 let's say

        for(int j = 1; j <= 10; j++){

            if(j == 7){
                continue;
            }
            System.out.println(j);
        }

    }
}