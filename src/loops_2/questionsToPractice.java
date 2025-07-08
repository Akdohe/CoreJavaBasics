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
        System.out.println("please enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    for (int i = 0; i<=n; i++){
    if ( i % 2 == 0) {
        System.out.println(i + " ");
    }
    }
    }
    }




