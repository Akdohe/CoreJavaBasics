import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter Length :");
        double length = sc.nextDouble();
        System.out.println("please enter the width: ");
        double width = sc.nextDouble() ;
        double area = length * width ;
        System.out.println("the area is : " + area);

        //Following are ChatGPT review improvement
        System.out.printf("The area is: %.2f\n", area); // formatted output

        sc.close(); // good practice to close scanner
    }
}
