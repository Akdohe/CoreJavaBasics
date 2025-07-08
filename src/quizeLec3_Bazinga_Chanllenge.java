import java.util.Scanner;

public class quizeLec3_Bazinga_Chanllenge {
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
        Scanner sc = new Scanner(System.in);
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



    }
}
