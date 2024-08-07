public class C_CheckArraySorted {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        boolean ans=Check(arr);
        System.out.println(ans);

    }

    private static boolean Check(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
