class Solution {
    public int divide(int v, int d) {
        int ans=0;
        long val=v*1l;
        long div=d*1l;
        int sign=1;
       
        if(div<0){
            sign*=-1;
            div*=-1;
        }
        if(val<0){
            sign*=-1;
            val*=-1;
        }
        if(v==Integer.MIN_VALUE && d==-1)
            return Integer.MAX_VALUE;
        
        // while(val>=div){         //Just Tle🥲
        //     long temp=div;
        //     int c=0;
        //     while((temp>>1) <=val  && temp<(temp>>1)){
        //         temp=temp>>1;
        //         c++;
        //     }
        //     ans+=(int)Math.pow(2,c);
        //     val=val-temp;
        // }
        for(int i=31;i>=0;i--){
             int a=(int)Math.pow(2,i);
            if(val-a>=0 && val-div*a >=0){
                ans+=a;
                val-=div*a;
            }
        }
        return ans*sign;
    }
}