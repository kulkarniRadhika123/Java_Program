public class K_MoveZeroesToLast {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};

        int n=nums.length;

        moveZeroes(nums,n);
    }

    //BRUTE FORCE APPROACH STRIVER

    private static void moveZeroes(int[] nums, int n) {
        int[] temp=new int[nums.length];
        int j=nums.length-1;
        System.out.println(j);
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                temp[j]=nums[i];
                j--;
                count++;
            }
        }

        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }


        j=0;

        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                temp[j]=nums[i];
                j++;
            }
        }
        System.out.println();
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }



        for(int i=0;i<temp.length;i++){
            nums[i]=temp[i];
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");// 1 3 12 0 0
        }

    }
}
