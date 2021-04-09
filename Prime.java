package prime;

import java.util.Scanner;

public class Prime {


    public static void main(String[] args) {
        // TODO code application logic here
        int flag =0;
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if(a==1)
        {
            System.out.println(a+" is neither a prime no or composite no");
        }
        else
        {
            
        
        for(int i=2;i<=Math.sqrt(a);i++)
        {
            if((a%i)==0)
            {
                flag = 1;
                break;
            }           
            
        }
        
        if(flag==1)
        {
            System.out.println(a+" is not a Prime number");
        }
        else
        {
           System.out.println(a+" is a Prime number");
        }
    }
    }
    
}
