public class G_RightRoataeArrayBy1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        //[6 1 2 3 4 5]

        rightShift(arr);
    }

    private static void rightShift(int[] arr) {

        int a=arr[arr.length-1];
       // System.out.println(a);

        for(int i=arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];

        }



        arr[0]=a;
        System.out.println();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
