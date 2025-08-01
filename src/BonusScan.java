import java.util.Scanner;

public class BonusScan {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine(); // String input will takje whole name not first char

        System.out.println("please enter your age");
        int age = sc.nextInt();
        System.out.println("Hello " + name + " Nice to meet & your age is " + age);


    }
}
