class Solution {
    public String stringHash(String s, int k) {
        int n = s.length();
        char[] result=new char[n/k];
        int i=0,j=0,l=0;
        while(i<n/k){
            int asc=0;
            while(j<(k*(i+1))){
                asc+=s.charAt(j)-97;
                j++;
            }
            asc=(asc%26)+97;
            char c=(char)asc;
            result[l++]=c;
            i++;
        }
        String res=new String(result);
        return res;
    }
}