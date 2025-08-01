import java.util.Scanner;

public class funcxtionInJava {

// Function is like it takes inp and gives op to uus is csalled as functions
//        it return the types
//        void-means no return to anything  public    static will be easily cleared in the oop
//        function name should not be an existing keyword in java function name should be explanatory
//        syntax : return type functiuonName(type arg1, type arg2, . . ){//operations}

//        print a given name in a function
//        print a given name in a function

            public static void printMyName(String name){ // camelCase
                System.out.println("Hello "+name+ " Nice to meet you");
                return ;
            }

            public static void namePrint(String name2){
                System.out.println("Hello "+name2 + " NIce to meet you");
                return;
            }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = sc.next();
        printMyName(name);//calling function, function name should be descriptive

    }
}




