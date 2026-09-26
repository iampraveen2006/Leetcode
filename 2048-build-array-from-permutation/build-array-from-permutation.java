class Solution {
    public int[] buildArray(int[] n) {
       int b[]=new int[n.length];

        for(int i=0;i<n.length;i++){
            b[i]=n[n[i]];
        }
        return b;
        
        }
        

    }
