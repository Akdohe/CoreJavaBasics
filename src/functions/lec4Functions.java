package functions;

import java.util.Scanner;

public class lec4Functions {
//    Q1 print a given name in the functions
    public static void printFunctions(String name){
        System.out.println("Hello "+ name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the name");
        String name = sc.nextLine();
        printFunctions(name);
    }

}
