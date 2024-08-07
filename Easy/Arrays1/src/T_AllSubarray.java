import java.util.*;
public class T_AllSubarray{
    public static void main(String[] args) {

        /*
        PS E:\JAVA PRACTICSE YOUTUBE,STRIVER\Arrays\Easy\Arrays1\src> java T_AllSubarray
        [1, 12, 13, 14, 15]
        Subarray: [1]
        Subarray: [1, 12]
        Subarray: [1, 12, 13]
        Subarray: [1, 12, 13, 14]
        Subarray: [1, 12, 13, 14, 15]
        Subarray: [12]
        Subarray: [12, 13]
        Subarray: [12, 13, 14]
        Subarray: [12, 13, 14, 15]
        Subarray: [13]
        Subarray: [13, 14]
        Subarray: [13, 14, 15]
        Subarray: [14]
        Subarray: [14, 15]
        Subarray: [15]

         */

        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(12);
        a.add(13);
        a.add(14);
        a.add(15);
        System.out.println(a);

        int length=a.size();

        int specified_length=2;

        if(specified_length>length){
            System.out.println("Specified length is graeter than list size");
            return;
        }

        for(int i=0;i<length;i++) {
            for (int j = 1; j <= length - i; j++) {
                List<Integer> b = a.subList(i, i+j);
                System.out.println("Subarray: " + b.toString());
            }
        }
    }
}

/* [1, 12, 13, 14, 15]
i<=5 j<=5-i
i=0 j=1 j<=5 sublist(0,0+1)-->[1]
    j=2 j<=5  sublist(0,0+2)-->[1,12]
    j=3 j<=5 sublist(0,0+3)--->[1, 12, 13]
    j=4 j<=5 [1, 12, 13, 14]
    j=5 j<=5 [1, 12, 13, 14, 15]
    j=6 j<=length-i j=6 is not less than 5

i=1 j=1 j<=4 sublist(1,2)-->[12]
             Subarray: [12, 13]
            Subarray: [12, 13, 14]
            Subarray: [12, 13, 14, 15]

i=2            Subarray: [13]
            Subarray: [13, 14]
            Subarray: [13, 14, 15]
i=3          Subarray: [14]
            Subarray: [14, 15]
i=4           Subarray: [15]



 */

