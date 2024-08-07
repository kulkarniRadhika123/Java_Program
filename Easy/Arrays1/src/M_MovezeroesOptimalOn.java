public class M_MovezeroesOptimalOn {
    public static void main(String[] args) {

     int[] nums={0,3,12,9,7,0,9};

    int n=nums.length;

    move(nums, n);

    }
//TIME COMPLXITY O(N)

    //SPACE COMPLEXITY O(1) since no extra array is taken
    public static void move(int[] nums,int n){

        int j=-1;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }


        if(j==-1)
            System.out.println("no zeroes");

        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;

                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");//1,3,12
        }
    }
    }

