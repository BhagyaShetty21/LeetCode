class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int c=0;
        while(set.add(c)){
            c=0;
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