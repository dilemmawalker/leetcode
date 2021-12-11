class Solution {
    public List<String> letterCombinations(String str) {
        int n=str.length();
        
        String[]arr=new String[10];
        arr[0]="";
        arr[1]="1";
        arr[2]="abc";
        arr[3]="def";
        arr[4]="ghi";
        arr[5]="jkl";
        arr[6]="mno";
        arr[7]="pqrs";
        arr[8]="tuv";
        arr[9]="wxyz";
        
        ArrayList<String>temp=new ArrayList<>();
        ans=temp;
        
        sol(str,n,0,arr);
        return ans;
    }
    public static ArrayList<String>ans=new ArrayList<>();
    public void sol(String str,int n,int idx,String[]arr){
        if(idx==n){
            return;
        }
        ArrayList<String>temp=new ArrayList<>();
        // temp.addAll(ans);
        for(int i=0;i<arr[str.charAt(idx)-'0'].length();i++){
            char ch=arr[str.charAt(idx)-'0'].charAt(i);
            // System.out.print(ch);
            for(int j=0;j<ans.size();j++){
                temp.add(ans.get(j)+ch+"");
            }
            if(ans.size()==0)
                temp.add(ch+"");
        }
        // System.out.print(temp);
        ans=new ArrayList<>();
        for(int i=0;i<temp.size();i++){
            ans.add(temp.get(i));
        }
        sol(str,n,idx+1,arr);
    }
}