import java.util.Scanner;

public class lecture3Conditional {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
   /*       System.out.println("please enter your age :");
        int age = sc.nextInt();
        if (age > 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }
  */

//        MOdulo usage for odd and even
/*
        System.out.println("Here the program start for ifdentifying the odd or even number");
        System.out.println("please enter value of x");
        int x = sc.nextInt();
        if ( x % 2 == 0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("Odd number");
        }
*/

 // QQ :  take twi number form user a & b and there greter and lesse signs

        System.out.println("please enter the value of a:");
    int a = sc.nextInt();

        System.out.println("please enter the value of b");
        int b = sc.nextInt();
        if (a==b){
            System.out.println("a is equall to b");
        }
/*
        else{
            if (a>b){
                System.out.println("greater");
            }
            else{
                System.out.println("lesser");
            }
        }
*/
   // elseif introduced here
        else if (a>b) {
            System.out.println("a is greater than b ");
        }
        else {
            System.out.println("a is lesser");
        }

    }
}
