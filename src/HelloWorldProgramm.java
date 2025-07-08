import java.util.Scanner;

public class HelloWorldProgramm {
    public static void main(String[] args) {
//Lets generate random number generator
        int userNumber = 0;
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random()* 100);

        do {
            System.out.println("Guess the number betwwen 1-100 : ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber){
                System.out.println("Wooow......You have guessed it correct");
                break;
            } else if (userNumber > myNumber) {
                System.out.println( " the entered number is too large");
            } else {
                System.out.println("The entered number is small than the actual number");

            }
        } while (userNumber >=0 );

        System.out.println("My number was : " + myNumber);
    }
}
