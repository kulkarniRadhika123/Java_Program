public class O_MissingNumber {
    public static void main(String[] args) {
        int[] nums={0,4,2,3};

        int n=nums.length;

        int res=missing(nums,n);
        System.out.println("optimal: "+res);

        int ress=missingNumberUsingFlag(nums,n);
        System.out.println("brute force: "+ress);
        missingNumberUsingHash(nums,n);
        //System.out.println(ress);

    }



    private static int missingNumberUsingFlag(int[] nums, int n) {
//DO NOT CLEAR ALL TEST CASES IN LEETCODE
        for(int i=0;i<=n;i++){
            int flag=0;
            for(int j=0;j<n;j++){
                if(nums[j]==i){
                    flag=1;
                    break;
                }
            }

            if (flag==0)
                return i;
        }
        return -1;
    }

    private static void missingNumberUsingHash(int[] nums, int n) {

        int[] hash=new int[n+1];


        for(int i=0;i<nums.length;i++){
            hash[nums[i]]+=1;
           // System.out.println( hash[nums[i]]+" i : "+i);
        }
        for (int i = 0; i <= n; i++) {
            System.out.println("hash[" + i + "] = " + hash[i]);
        }
        int a=-1;
        for(int i=0;i<=n+1;i++){
            if(hash[i]==0){
                a=i;
                break;
            }
        }

        System.out.println("Better approach using hashing: "+a);


    }

    private static int missing(int[] nums, int n) {
        //LEETCODE
        int sum=0;
            for(int i=0;i<n;i++){
                sum+=nums[i];
            }

            int esum=(n*(n+1))/2;

            int result=esum-sum;

            return result;

    }
}
