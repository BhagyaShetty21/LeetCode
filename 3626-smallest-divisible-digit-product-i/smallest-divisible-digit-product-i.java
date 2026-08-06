class Solution {
    public int smallestNumber(int n, int t) {
    while(true){
        int res=1;
        int num=n;
        while(num>0){
            res*=num%10;
            num=num/10;
        }
        if(res%t==0) return n;
        n+=1;
    }
    }
}