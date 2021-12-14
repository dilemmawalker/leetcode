class Solution {
    public boolean isAnagram(String s, String t) {
        int []arr=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            int idx=s.charAt(i)-'a';
            arr[idx]++;
        }
        n=t.length();
        for(int i=0;i<n;i++){
            int idx=t.charAt(i)-'a';
            arr[idx]--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0)
                return false;
        }
        return true;
    }
}