import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
//        If the given or entered number is even number then print Bazinga
/*
        System.out.println("please enter the number ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0){
            System.out.println("Bazinga");
        } else  {
            System.out.println("Number is not Even : Zinga_Zinga");
        }*/
// Print the greetings according to the number enetered by user
        // 1: hello  2: Namaste 3 : bonjour
    /*    Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number from range of 1-3 ");
        int Rnumber = sc.nextInt();
        if (Rnumber == 1 ){
            System.out.println("Hello");
        } else if (Rnumber == 2) {
            System.out.println("Namaste");
        }
        else if (Rnumber == 3){
            System.out.println("Bonjour");
        }
        else {
            System.out.println("Invalid entry plese try again");

        }
*/
// Print the greetings according to the number entered by user
        // 1: hello  2: Namaste 3 : bonjour
     /*   Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number from range of 1-3 ");
        int number = sc.nextInt();
        switch (number){
            case 1 : System.out.println("Hello");
                break;
            case 2 :
                System.out.println("Namaste");
                break;
            case 3 :
                System.out.println("Bounjour");
                break;
            default:
                System.out.println("Invalid entry");
        }*/

//        Calculate two numbers a & b and perform operations as follows
        //1. addition of 2 numbewrs 2. subtraction 3. multiplicaiton 4.division 5.modullo
//        Ask user to enert number of month and prin tthe month acoording to entered number

        //1
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the two number 1st number : ");
        int firstNumber = sc.nextInt();
        System.out.println("please enter the second number : ");
        int socondNumber = sc.nextInt();
        System.out.println("plese enter what type of calcution you want to perform with this number\n1.Addition \n2.subtraction \n3.Multiplication\n4.division\n5.Modulo");
        int calculaion = sc.nextInt();
        int addition = (firstNumber + socondNumber);
        int subtraction = (firstNumber - socondNumber);
        int Multiplication = (firstNumber * socondNumber);
        int Division =   (firstNumber/socondNumber) ;
        int Modulo = (firstNumber % socondNumber) ;
        switch (calculaion){
            case 1:
                System.out.println("Addition is:" +  addition);
                break;
            case 2:
                System.out.println("Subtraction is: " +subtraction );
                break;
            case 3 :
                System.out.println("Multiplication is : " + Multiplication );
                break;
            case 4 :
                System.out.println("Division is : " + Division);
                break;
            case 5 :
                System.out.println("modulation :" + Modulo );
                break;
            default:
                System.out.println("invalid");
        }

        System.out.println("Please enter the number of month you wanted to print");
        int month = sc.nextInt() ;

        switch (month){
            case 1 :
                System.out.println("Janaury");
                break;
            case 2 :
                System.out.println("Feb");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("Sept");
                break;
            case 10 :
                System.out.println("October");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("December");
                break;

        }


    }
}
