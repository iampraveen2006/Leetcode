class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int ec) {
        List<Boolean> a=new ArrayList<>();
        int max =c[0];
        for(int i=1;i<c.length;i++){
            if(c[i]>max){
                max=c[i];

            }
        }
        for(int i=0;i<c.length;i++){
            if(c[i]+ec >= max){
                a.add(true);
            }else{
                a.add(false);
            }
        }
        return a;
    }
}