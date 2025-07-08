import java.util.Scanner;

public class firstTestProgramm {

public static void main(String[] args) {
    System.out.println("Hello World");

    System.out.print("Hi world \n Hello World"); //will print in new line aftr \n

//    To pring the pattern like in line wise *  **  **** *****

    System.out.print("\n*\n**\n***\n****"); // we can use by using each print statements also for each star
//Variable defining
    String name = "Tunny Start" ;
    int age = 48 ;
    int b = 10 ;
    double price = 25.25;
    boolean isPandu = false ;
    float prise1= 22.25F;
    int sum = age * b ;
    System.out.println("\n" + sum);
    int sum2 = (age*b)/(age-b) ;
    System.out.println(sum2);

//   taking input valuse in java throught the scanner class
    System.out.println("please enter your name: ");

    Scanner sc = new Scanner(System.in) ;// for in we use system.out as system.in

    String name2 = sc.nextLine();// for first work for whole words like name surname line use line
    //System.out.println("please enter your name " + name2);
    System.out.println("Hello " + name2);

}

}
