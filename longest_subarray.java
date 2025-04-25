//Sliding window problem
public class longest_subarray {
    public static int longest_subarr(int [] arr, int target){
        int j=0;
        int i=0;
        int l =arr.length;
        int sum=0;
        int maxl=0;
        while(j<l){
            sum=sum+arr[j];
            if(sum==target){
                int len= (j-i)+1;
                maxl= Math.max(maxl,len);
            }
            //shrink the window
            while(sum>target && i<=j){
                sum=sum-arr[i];
                i++;
            }
            j++;
        }
        return maxl;
    }
    public static void main(String[] args) {
        int arr[]= {2, 3, 5, 1, 9};
        //edge case is here
        //int arr[]={1,2,3,4,5};// where target = 9 -this is why shrinking is required;
        int k=10;
        System.out.println(longest_subarr(arr, k));
    }
}
