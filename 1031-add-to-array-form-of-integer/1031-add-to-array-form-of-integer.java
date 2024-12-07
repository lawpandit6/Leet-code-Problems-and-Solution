class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int pointer=num.length-1;
        int remains=0;
        List<Integer> l=new ArrayList<>();
        while(pointer>=0 || k>0){
            int value=0;
            if(pointer>=0){
                value=num[pointer];
            }

            int sum=value+(k%10)+remains;
            int digit=sum%10;
            remains=sum/10;
            l.add(digit);
            pointer--;
            k/=10;

        }
        if(remains>0){
            l.add(remains);
        }
        Collections.reverse(l);
        return l;
    }
}