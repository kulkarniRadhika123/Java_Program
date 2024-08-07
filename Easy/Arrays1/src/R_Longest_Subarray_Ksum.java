import java.util.HashMap;

public class R_Longest_Subarray_Ksum {
    public static void main(String[] args) {
        int[] arr={2,1,-1,1,-1,3};
        int k=3;
        int n=arr.length;

        int bruteforce_ans=find(arr,k,n);
//        Time Complexity: O(N3) approx., where N = size of the array.
//        Reason: We are using three nested loops, each running approximately N times.
//
//        Space Complexity: O(1) as we are not using any extra space.
        System.out.println(bruteforce_ans);

        int better_bruteforce=findLong(arr,k,n);

//        Time Complexity: O(N2) approx., where N = size of the array.
//                Reason: We are using two nested loops, each running approximately N times.
//
//        Space Complexity: O(1) as we are not using any extra space.

        System.out.println(better_bruteforce);

        int usingHashmap=findSubarray(arr,k,n);
//        Time Complexity: O(N) or O(N*logN) depending on which map data structure we are using, where N = size of the array.
//                Reason: For example, if we are using an unordered_map data structure in C++ the time complexity will be O(N)(though in the worst case, unordered_map takes O(N) to find an element and the time complexity becomes O(N2)) but if we are using a map data structure, the time complexity will be O(N*logN). The least complexity will be O(N) as we are using a loop to traverse the array.
//
//        Space Complexity: O(N) as we are using a map data structure.
        System.out.println(usingHashmap+"--->using hashing");
    }




    private static int find(int[] arr, int k,int n) {
        int length=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                long sum=0;
                for(int kk=i;kk<=j;kk++) {
                    sum += arr[kk];
                }
                    if(sum==k){
                        length=Math.max(length,j-i+1);
                    }


            }
        }
        return length;
    }

    private static int findLong(int[] arr, int k, int n) {
        int length=0;
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){

//                Assume previous subarray = arr[i……j-1]
//                current subarray = arr[i…..j]
//                Sum of arr[i….j] = (sum of arr[i….j-1]) + arr[j]
//
//                This is how we can remove the third loop and while moving the j pointer, we can calculate the sum.


                    sum += arr[j];

                if(sum==k){
                    length=Math.max(length,j-i+1);
                }


            }
        }
        return length;
    }

    private static int findSubarray(int[] arr, int k, int n) {

        HashMap<Integer,Integer> h=new HashMap<>();
        int sum=0;
        int maxlen=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(sum==k){
                maxlen=Math.max(maxlen,i+1);

            }
            int rem=sum-k;

            if(h.containsKey(rem)){
                int len=i-h.get(rem);
                maxlen=Math.max(maxlen,len);
            }

            if(!h.containsKey(sum)){
                h.put(sum,i);
            }
        }
        System.out.println(h);
        return maxlen;

    }

}
