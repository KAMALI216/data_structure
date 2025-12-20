class Solution {
    public static  boolean isMonotonic(int[] arr) {
        boolean a=true;
        boolean b=true;
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                a=false;

            }
            if(arr[i]>arr[i+1])
            {
                b=false;
            }
            
        }
        return a || b;

        
    }
    public static void main(String args[])
    {
        int[] nums = {1,2,2,3};
        boolean q=isMonotonic(nums);
        System.out.println(q);
    }
}