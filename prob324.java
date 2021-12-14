class Solution {
    public void wiggleSort(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int p1=0,p2=0;
        if(n%2==0){
            p1=n/2-1;
            p2=n-1;
        }
        else{
            p1=n/2;
            p2=n-1;
        }
        
        int[]ans=new int[n];
        int idx=0;
        while(p1>=0 && p2>=0){
            int a=arr[p1];
            int b=arr[p2];
            ans[idx++]=a;
            if(idx<n)
                ans[idx++]=b;
            p1--;
            p2--;
        }
        if(p1>=0 && idx<n)
            ans[idx]=arr[p1];
        
        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }
    }
}