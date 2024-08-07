import java.util.*;
public class Subarray{
    public static void main(String[] args) {
        //System.out.println("helllo");
        /*
PS E:\JAVA PRACTICSE YOUTUBE,STRIVER\Arrays\Easy\Arrays1\src> javac Subarray.java
PS E:\JAVA PRACTICSE YOUTUBE,STRIVER\Arrays\Easy\Arrays1\src> java Subarray
[1, 12, 13, 14, 15]
Subarray: [1, 12]
Subarray: [12, 13]
Subarray: [13, 14]
Subarray: [14, 15]

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

        //length=5
        //specified_length=2

        for(int i=0;i<=length-specified_length;i++){//0 to 3,1 to 3 ,2 to 3,3 to 3
            List<Integer> b= a.subList(i,i+specified_length);//0 to 2 Subarray: [1, 12],1 to 3, Subarray: [12, 13] ,2 to 4 Subarray: [13, 14],3 to 5 Subarray: [14, 15]
            System.out.println("Subarray: " +b.toString());
        }
    }
}

