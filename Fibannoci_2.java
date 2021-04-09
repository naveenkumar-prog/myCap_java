
package fibannoci_2;

import java.util.Scanner;

public class Fibannoci_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the nth term ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
    
    public  static int fib(int n)
    {
        if(n<=1)
        {
          return n;
        }
        else
        {
          return  fib(n-1)+fib(n-2);
        }
        
    }
    
}
