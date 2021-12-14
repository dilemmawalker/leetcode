class Solution {
    public boolean checkPowersOfThree(int n) {
       for(int i=19;i>=0;i--){
           int val=(int)Math.pow(3,i);
           if(n-val>=0){
               n-=val;
           }
       }
        if(n==0)
            return true;
        return false;
    }
}