package functions;

import java.util.Scanner;

public class multiplyOfTwoNumber {
    public static int productOfTwo(int a, int b){
        int product = a * b;
//        System.out.println(product);
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of A");
        int a = sc.nextInt();
        System.out.println("enter the value of B");
        int b =sc.nextInt();
        int product = productOfTwo(a,b);
        System.out.println("The product is : " + product);
    }
}
