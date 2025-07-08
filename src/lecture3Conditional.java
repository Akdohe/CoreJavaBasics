import java.util.Scanner;

public class lecture3Conditional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your age :");
        int age = sc.nextInt();
        if (age > 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}
