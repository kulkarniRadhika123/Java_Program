public class D_RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,1,2};

        removeDuplicates(arr);
    }

    private static void removeDuplicates(int[] arr) {


        int j=0;
        int[] temp=new int[arr.length];

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j]=arr[i];
                j++;
            }
        }

        temp[j]=arr[arr.length-1];

        for(int i=0;i<=j;i++){
            //System.out.print(temp[i]+" ");
            arr[i]=temp[i];
        }
        for(int i=0;i<=j;i++){
            System.out.print(arr[i]+" ");
            //arr[i]=temp[i];
        }

    }
}
