
package sample_switch_case;

import java.util.Scanner;


public class Sample_switch_case {

    public static void main(String[] args) {
        
        int choice;
        System.out.println("Choose any one \n1.Hi\t2.Hello\t3.Hey");
        Scanner s = new Scanner(System.in);
        choice = s.nextInt();
        switch(choice)
        {
            case 1: System.out.println("You said Hi");
            break;
            case 2: System.out.println("You said Hello");
            break;
            case 3: System.out.println("You said Hey");
            break;
            default: System.out.println("Invalid choice");

        }
        

    }
    
}
