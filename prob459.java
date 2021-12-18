class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        int[]arr=new int[n];
        
        int idx=1;
        int len = 0;  
      arr[0] = 0; 
      while (idx < n)       //lps array construction
      {
         
         if (s.charAt(idx) == s.charAt(len))
         {
           len++;
           arr[idx] = len;
           idx++;
         }
         else
         {
           if (len != 0)
           {
             len = arr[len-1];
            
           }
           else 
           { 
             arr[idx] = 0;
             idx++;
           }
         }
      }
       
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
         boolean flag=false;
        idx=n-1;
        
        idx=n-arr[n-1]-1;           //all verification steps now.
        if(idx==n-1)
            return false;
        
        int e=idx;
         len=e+1;
        if(n%len!=0)
            return false;
        
        for(int i=idx+1;i<n;i++){
            if(arr[i]==0)
                return false;
        }
        return true;
    }
}