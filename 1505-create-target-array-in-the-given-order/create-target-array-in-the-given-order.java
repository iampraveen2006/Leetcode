class Solution {
    public int[] createTargetArray(int[] n, int[] index) {
        List<Integer>a =new ArrayList<>();
        for(int i=0;i<n.length;i++){
            a.add(index[i],n[i]);

        }
        int ab[]=new int[a.size()];
        for(int i=0;i<n.length;i++){
            ab[i]=a.get(i);
        }
        return ab;


        
    }
}