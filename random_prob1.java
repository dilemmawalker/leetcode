public static Solution{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine().trim());

        String s =scan.nextLine();

        int B=Integer.parseInt(scan.nextLine().trim());

        int G=Integer.parseInt(scan.nextLine().trim());

        int result = fillseats(n,s,B,G);

        System.out.println(result);
    }
    public static int fillseat(int n, String s, int b, int g){
        ArrayList<Integer>arr = new ArrayList<>();
        int count = 0;
        //ArrayList construct
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='0'){
                count++;
            }
            else{
                if(count!=0)
                arr.add(count);
                count = 0;
            }
        }

        //seating
        n=arr.size();
        int total=0;
        for(int i=0;i<n;i++){
            int val = arr.get(i);
            
                int seat = val/2;
                if(g>=seat && boy >=seat){
                    g-=seat;boy-=seat;
                    if(val%2!=0){
                        if(g>b)
                        g--;
                        else
                        b--;
                    }
                    total+=val;
                }
                else{
                    if(g<seat && b<seat && b==g){
                        total + = g*2;
                        g=0;
                        b=0;
                    }
                    else{
                        int min=Math.min(g,b);
                        total+=min*2+1;
                        g-=min;
                        b-=min;
                        if(g>b)
                        g--;
                        else
                        b--;
                    }
                }
            }
    }
}