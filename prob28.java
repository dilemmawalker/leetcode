class Solution {                //. Z - Algorithm.
    public int strStr(String hay, String str) {
        int initial=hay.length();
        String inhay=hay;
        hay=str+hay;
        int n=hay.length();
        int m=str.length();
        if(initial<m)
            return -1;
        if(initial==m){
            for(int i=0;i<m;i++){
                if(inhay.charAt(i)!=str.charAt(i))
                    return -1;
            }
            return 0;
        }
        if(m==0 )
            return 0;
        int[]z=new int[n+1];
        
        int s=0,e=0;
        int idx=1;
        int ans=0;
        while(idx<n){
            if(idx>=s && idx<=e){
                //copy from previous using ans. & set start & end.
                int ii=1;
                while(idx<=e){
                    z[idx]=Math.min(z[ii],e-idx+1);
                    // z[idx]=z[ii];
                    idx++;ii++;
                }
                idx=s;
                while(idx<=e){
                    if(z[idx]==e-idx+1){
                        System.out.println(e+"triggered");
                        int p1=z[idx],p2=e+1;
                        while(p2<n && hay.charAt(p1)==hay.charAt(p2)){
                            p1++;p2++;
                        }
                        if(p2-(e+1)>0){
                            s=idx+1;
                             z[idx]+=p2-(e+1);
                            e=Math.min(p2-1,n-1);
                           
                            idx++;
                            break;
                        }
                    }
                    idx++;
                }
            }
            else{
                int ii=0;int id=idx;
                while(id<n && hay.charAt(ii)==hay.charAt(id)){
                    id++;
                    ii++;
                }
                // System.out.print(id+"->"+ii+" ");
                ans=ii;
                s=idx+1;
                e=Math.min(id-1,n-1);
                z[idx]=ans;
                idx++;
            }
        }
        // System.out.println();
        int anss=-1;
        for(int i=0;i<=n;i++){
            System.out.print(z[i]+" ");
            if(i>=m && z[i]>=m && anss==-1)
                anss= i-m;
        }
        return anss;
    }
} 