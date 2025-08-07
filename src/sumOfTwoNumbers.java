import java.util.Scanner;

public class sumOfTwoNumbers {

    public static int sumOfTwoN(int a, int b){
        int sum = a+b;
        return sum ;
    }

    public static void main(String[] args) {
        //  Q amke function to Adding two functions in memoriesand retuern the sum

//    Here declaring the values of a & b
            Scanner sc1 = new Scanner(System.in);
            int a = sc1.nextInt();
            int b = sc1.nextInt();

            int sum = sumOfTwoN(a,b);



    }
}

