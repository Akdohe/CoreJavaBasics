package functions;

import java.util.Scanner;

public class calSum {
    public static int sumCalcii(int a, int b) {
        int sum = a+b ;
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("PLease enter the value of the a :");
        int a = sc.nextInt();
        System.out.println("PLease enter the value of the b :");
        int b = sc.nextInt();

        int sum = sumCalcii(a,b);
        System.out.println("the sum of a and b is :" + sum);
    }
}
