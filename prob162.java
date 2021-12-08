class Solution {
    public int findPeakElement(int[] arr) {
        int n=arr.length;
        if(n==1)
        return 0;
        int s=0,e=n-1;
        while(s<e){
            int mid=(s+e)/2;
            if((mid==0 && arr[mid]>arr[mid+1]) || (arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])){
                return mid;
            }
            else if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return s;
    }
}