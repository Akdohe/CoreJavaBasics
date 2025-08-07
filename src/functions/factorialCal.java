package functions;

import java.util.Scanner;

public class factorialCal {
    public static void printFactorial(int n){
        if (n<0){
            System.out.println("Not a valid number for Factorial");
        }
        int factorial = 1;
        for (int i = n ; i>=1; i--){
             factorial = factorial * i ;
        }
        System.out.println(factorial);
        return ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Please entre the value of n:");
        int n = sc.nextInt();
         printFactorial(n);
    }
}
