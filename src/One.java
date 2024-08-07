public class One {
    public static void main(String[] args) {

        int n=3;
//        pattern1(n);
//        System.out.println();
//        pattern2(n);
//        System.out.println();
//        pattern3(n);
//        System.out.println();
//        pattern4(n);
//
//        System.out.println();
//        pattern5(n);

        System.out.println();
        pattern6(n);

//        System.out.println();
//        pattern7(n);






    }
    static void pattern7(int n) {
        for(int i=0;i<2*n;i++) {


            int totalColsinRow=i>n?2*n-i:i;
            int noOfSpaces=n-totalColsinRow;

            for(int k=0;k<noOfSpaces;k++){
                System.out.print(" ");
            }

            for (int j = 0; j <totalColsinRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n) {

        for (int i = 0; i <n; i++) {
            // Print spaces
            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            /*
            PYRAMID
             */
            // Print stars
            for (int k = 0; k <=i; k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }

     static void pattern5(int n) {

         for (int i = 0; i <n; i++) {
             // Print spaces
             for (int j = 0; j <n-i-1; j++) {
                 System.out.print(" ");
             }

             // Print stars
             for (int k = 0; k <=i; k++) {
                 System.out.print("*");
             }
             /*


              *
              **
              ***


              */

             // Move to the next line
             System.out.println();
         }
    }

    static void pattern4(int n) {
        for(int i=0;i<2*n;i++) {
            int totalColsinRow=i>n?2*n-i:i;

                for (int j = 0; j <totalColsinRow; j++) {
                    System.out.print("*");
                }

                /*


                             *
                             **
                             ***
                             **
                             *

    */
                System.out.println();
            }
        }




    static void pattern3(int n) {
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num);
                num++;
            }
            num=1;
            System.out.println();

        }

    }

    static void pattern1(int n) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }

        static void pattern2(int n){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3 - i; j++) {
                    System.out.print("*");
                }
                System.out.println();


            }
        }

}
