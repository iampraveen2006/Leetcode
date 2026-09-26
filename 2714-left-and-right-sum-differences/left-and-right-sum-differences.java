class Solution {

    public int[] leftRightDifference(int[] n) {
        int a[]=new int[n.length];
        for(int i=0;i<n.length;i++){
            int l=0;
            int r=0;
            for(int j=0;j<i;j++){
                l+=n[j];
                }
                for(int j=i+1;j<n.length;j++){
                    r+=n[j];

                }
                int ab=Math.abs(l-r);
                a[i]=ab;


        }
        return a;
        
    }
}