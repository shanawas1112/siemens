package exceptionhanding;

import java.util.Scanner;

public class ZeroDivide{

    public static void main(String[] args) {
        

         try (Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();


            int n2 = sc.nextInt();
            try {
                System.out.println("N1 divied by N2 gives: "+n1/n2);
                break;
            } catch (ArithmeticException ex){
                System.out.println("Try again! Invalid input");
            
   }
        }
    } 

  
}