public class Main {
    public static void main(String[] args) {
int n=5;
pattern1(n);
        System.out.println(" ");
pattern2(n);

        System.out.println(" ");
        pattern3(n);

        System.out.println(" ");
        pattern4(n);

        System.out.println(" ");
        invertedPyramid(n);

        System.out.println(" ");
        pattern5(n);

        System.out.println(" ");
        pattern28(n);

        System.out.println(" ");
        pyramid(n);


    }

     static void pattern28(int n) {
        int i,j,k;
        for (i=0;i<2*n;i++){
            int totalcols=i>n?2*n-i:i;
            int spaces=n-totalcols;

            for(j=0;j<spaces;j++){
                System.out.print(" ");
            }

            for(k=0;k<totalcols;k++){
                System.out.print("* ");
            }

            System.out.println(" ");

         }
    }

    static void pyramid(int n) {
        int i,j,k;
        for (i=0;i<n;i++){

            int spaces=n-i;

            for(j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            for(k=0;k<i;k++){
                System.out.print("* ");
            }

            System.out.println(" ");

        }
    }

    static void pattern5(int n) {
         for (int i = 0; i < n; i++) {
             // Print spaces
             for (int j = 0; j <i; j++) {
                 System.out.print(" ");
             }
             for (int k = 0; k <n-i; k++) {
                 System.out.print("*");
             }

             // Move to the next line
             System.out.println();
         }
    }


    static void invertedPyramid(int n) {
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
                /*
                         * * *
                          * *
                           *
                 */
            // Print stars
            for (int k = 0; k <n-i; k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
    static void pattern4(int n) {

        for(int i=0;i<2*n; i++){

            int totalnocols=i>n?2*n-i:i;

            for(int j=0;j<totalnocols;j++){
                System.out.print("*");
            }

            System.out.println(" ");

         }
    }

    static void pattern3(int n) {
        for(int i=0;i<n;i++){
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }

            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pattern2(int n) {

         for(int i=0;i<n;i++){
             for(int j=0;j<n-i;j++){
                 System.out.print("*");
             }
             System.out.println(" ");
         }


    }

    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }


}