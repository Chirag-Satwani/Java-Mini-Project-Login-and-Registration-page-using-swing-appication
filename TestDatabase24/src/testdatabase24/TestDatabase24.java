
package testdatabase24;

import java.util.Scanner;



public class TestDatabase24
{

    public static void main(String args[])
    {   
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a limit");
        int n=sc.nextInt();
        Thread t= Thread.currentThread();
        System.out.println("Thread ="+t);
    
        for (int i = 0; i < n; i++) {
            try {
                System.out.println((int)(Math.random()*10000));
                Thread.sleep(1000);
                        } catch (InterruptedException e) {
                
                System.out.println(e);
            }
        }
        
    }
    
}
