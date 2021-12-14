class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0)
            return false;
        double val=((Math.log10(n)*1.0)/(Math.log10(3)*1.0));
        if(val-(int)val >=0.99998)
            val=(int)(val +1);
        if(val-(int)val >=0.0000)
            val=(int)val;
        System.out.println(val);
        int ans=(int)Math.pow(3,val);
        System.out.println(ans);
        if(ans==n)
            return true;
        return false;
    }
}