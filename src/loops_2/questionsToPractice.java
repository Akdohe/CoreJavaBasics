package loops_2;

import java.util.Scanner;

public class questionsToPractice {
    public static void main(String[] args) {
//        Print the sum of first n natural numbers
//        n=4 ;
/*
        int sum= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the desired number for the sum : ");
        int n = sc.nextInt() ;
        for (int i = 1; i<=n; i++) {
           sum = sum+i ; // here need to mention the sum + i  otherwise there will be wrong asnwers s
        }
        System.out.println(sum); // sum always print outside of loop

*/

//    Q2 print the number of the table
/*
        System.out.println("please enter the number for table");
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
for (int i = 1; i<=10; i++){
    System.out.println((counter * i));
}
*/

//    To print the even numbers
        // logic: number / 2 = 0 as remender which is ;ike modulo = 0

//        int mod = sc.nextInt();
/*        System.out.println("please enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    for (int i = 0; i<=n; i++){
    if ( i % 2 == 0) {
        System.out.print(i + " ");
    }
    }*/


        //Infinite loops
    /* for ( ; ; ){
        System.out.println("My College");
    }*/


        Scanner sc = new Scanner(System.in);
        int Ip_number ;

        do {
            System.out.println("please enter 1 to input the Marks, 0 to exit");
             Ip_number = sc.nextInt();

            if (Ip_number == 1) {
                System.out.println("Please your marks within range 0-100");
                int marks = sc.nextInt();

                if (marks >= 90 && marks <= 100) {
                    System.out.println("This are the very good marks");
                }
              else if (marks >= 60 && marks <= 89) {
                System.out.println("this is also good Marks");

            } else if (marks >=0 && marks <= 60) {
                System.out.println("This is also a good marks ");
                System.out.println("Always know that efforts matter marks not");
                
            }
            else {
                System.out.println("Invalid marks please enter between 0 to 100");
            }

            } else if (Ip_number != 0) {
                System.out.println("please select from 1 or 0");
            }
        } while (Ip_number != 0);

        System.out.println("Program Ended");

        sc.close();

    }}




