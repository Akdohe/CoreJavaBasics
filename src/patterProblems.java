public class patterProblems {
    public static void main(String[] args) {
        //  Scanner sc = new Scanner(System.in);
//        Q9　0, 1 triangles
        





//        Q8  Floyed's Triangle
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//        Ans

/*
        int n = 5;
        int num = 1;
        for (int i = 1; i <= n; i++) {
//            Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
*/

    }
}









//        Q7 inverted same numbering patter

//        12345
//        1234
//        123
//        12
//        1

//        Ans
        /*int n = 5;
        for (int i = 1; i <= n; i++) {
//            Inner loop
            for (int j = 1; j <= n-i+1; j++) { //here we need to make sure that the value of ja should be equal to i not less than it
                System.out.print(j);
            }
            System.out.println();
        }
    }}
*/












//     Q6 Pattern problem with numbering
//        1
//        1 2
//        1 2 3
//        1 2 3 4



//        System.out.println("please enter  value of n");
//        int n = sc.nextInt() ;
//        inner loop
//        for (int i = 1; i <=n; i++){
//
//            for (int j= 1; j<=i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }





//   *
//  **
// ***
//****
//        Pattern pyramyd
         /*int n = 4;
        // outer loop
        for (int i = 1; i<=n; i++) {
            //inner loop for spaces
            for (int j = 1; j<=n-i; j++) { // here ja is define within loop scope out of the loop there no j
                System.out.print(" ");
            }
            //for printing the star -- inner loop
            for (int j =1; j<=i ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

*/



// Reverse Pyramid here we will use decremental operator
//****
//***
//**
//*
        /*int n = 4;
        // outer loop
        for (int i = n; i >= 1; i--) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */


        /*//        Print Pattern / * \n ***** \n ****** ***** ***** ****
//        Q1 print pattern
        int m = 4;
        int n = 5;
//        outer loop
        for (int i = 1; i<=m ;i++ ){
            //inner loop
            for (int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/


//        Q2 Print patter by using the nesting of loops
//*****
//*   *
//*   *
//*****
/*

        int n = 4;
        int m = 5;
        // outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= m; j++) {
                //cell (i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // other than above will help this one to print
                }

            }
            System.out.println();
        }
*/


//*
//**
//***
//****

        //  int n = 4;
        //int m =   // only n is required here
        // outer loop

//        for (int i = 1; i <= n; i++) {
//            //inner loop
//            for (int j = 1; j <= i; j++) {
//                //cell (i,j)
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }

//    }
//}
