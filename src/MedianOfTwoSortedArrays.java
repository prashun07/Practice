public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans;
        int sum=nums1.length+nums2.length-1;
        int i=nums1.length-1;
        int j=nums2.length-1;
        int arr[]=new int[sum+1];
        while(i>-1 && j>-1){
            if(nums1[i]>=nums2[j])
            {arr[sum--]=nums1[i--];
            }
            else if(nums1[i]<nums2[j])
            {
                arr[sum--]=nums2[j--];
            }
        }
        while(i>-1)
        {
            arr[sum--]=nums1[i--];
        }
        while(j>-1)
        {
            arr[sum--]=nums2[j--];
        }
        int ind=(nums1.length+nums2.length);
        if(ind%2==0)
        {
            ans=(double)(arr[ind/2]+arr[-1+ind/2])/2.0000D;
        }else
            ans=(double)arr[ind/2];
        return ans;
    }
    public static void main(String args[])
    {
        int nums1[]={1};
        int nums2[] ={3,4,5,6};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
