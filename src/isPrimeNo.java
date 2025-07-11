import java.util.Scanner;

public class isPrimeNo {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("PLease enter the number to be check is prime or not : ");
        int num = sc.nextInt();
        boolean  isPrime = true ;
        if (num <= 1)  { // 0 & 1 are not prime number
            isPrime = false;
        }else {
        for (int i = 2; i < num ; i++){

            if (num % i == 0){
                isPrime = false;
                break;
            }

        }
        }
        if (isPrime){
            System.out.println(num + " Is a prime number ");
        }else {
            System.out.println("is not a prime number");
        }
    }
}
