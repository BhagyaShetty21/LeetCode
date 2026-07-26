class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(set.add(n)){
            int c=0;
            while(n>0){
            c+= Math.pow(n%10,2);
            n/=10;
            }
            if(c==1) return true;
            n=c;
        }
        return false;
    }
}