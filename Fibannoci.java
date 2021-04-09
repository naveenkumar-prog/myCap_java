package fibannoci;

import java.util.Scanner;

public class Fibannoci {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the number of terms ");
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        int a=0,b=1;
        System.out.println(a+"\n"+b);
        for(int i=2;i<inp;i++)
        {
            int c=a+b;
            System.out.println(c);
             a = b;
             b = c;
        }
    }
    
}
