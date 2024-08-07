public class I_RightShiftArrayByKtimes {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int k=8;


        rightShiftK(arr,k);
    }

    private static void rightShiftK(int[] arr,int k) {
        int n=arr.length;
        int d=k%n;

        int temp[]=new int[d];
        int j=0;

        for(int i=n-d;i<n;i++){
            temp[j]=arr[i];
            j++;
        }

        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");//[5,6]
        }

        for(int i=n-d-1;i>=0;i--){
            arr[i+d]=arr[i];
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");//1 2 1 2 3 4
        }

        for(int i=0;i<d;i++){
            arr[i]=temp[i];
        }
        System.out.println();
        System.out.println("ROATAED ARRAY");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");//5 6 1 2 3 4
        }

    }
}
