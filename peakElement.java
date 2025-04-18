//package Ankit-Codebase;

public class peakElement {
    public static int findPeakElement(int[] nums) {

        int left=0;
        int right=nums.length-1;

        while(left < right)
        {
            int mid=(left+right)/2;

            if(nums[mid]>nums[mid+1]){
                right=mid;
            }
            else
            {
                left=mid+1;
            }
        }
        return left;
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,3,4,5,6,1};
        int n=findPeakElement(arr);
        System.out.println(n);

    }
    
}
