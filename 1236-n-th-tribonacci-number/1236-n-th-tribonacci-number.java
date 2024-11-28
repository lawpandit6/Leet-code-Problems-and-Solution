class Solution {
    public int tribonacci(int n) {
        int t0=0,t1=1,t2=1;
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        for(int i=1;i<=n;i++){
            int t3=t0+t1+t2;
            t0=t1;
            t1=t2;
            t2=t3;
        }
        return t0;
    }
}