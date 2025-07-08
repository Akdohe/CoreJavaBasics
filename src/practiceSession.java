import java.util.Scanner;

public class practiceSession {
    public static void main(String[] args){

        System.out.println("please enter the value of a :");
        Scanner sc = new Scanner(System.in); // initializing scanner object
        int a = sc.nextInt(); // for integer value in the scanner
        System.out.println("Please enter the value of b : ");
        int b = sc.nextInt(); // for b value inserted thought the system
        int sum = a+b ;
        System.out.println("the sum of a & b is = " + sum );
    }
}
