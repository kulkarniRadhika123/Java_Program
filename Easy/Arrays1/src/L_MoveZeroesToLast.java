import java.util.ArrayList;

public class L_MoveZeroesToLast {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};

        int n=nums.length;

        moveZeroes(nums,n);
    }

    private static void moveZeroes(int[] nums, int n) {

        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                a.add(nums[i]);
            }
        }

        System.out.println(a);
        int nz=a.size();
        for(int i=0;i<nz;i++){
            nums[i]= a.get(i);
        }

        for(int i=nz;i<n;i++){
            nums[i]=0;
        }

        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");//1,3,12
        }
    }
}
