import java.util.Scanner;

public class Evenoddsum {

    public static void main(String[] args) {
        // Write your code here
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int num=n;
        int rem;
        int evensum=0,oddsum=0;

        while(num!=0){
            rem=num%10;
            if(rem%2==0){
                evensum+=rem;
            }
            else{
                oddsum+=rem;
            }

            num/=10;

        }

        System.out.print(evensum+""+oddsum);

    }
}
