public class Solution {
    public int titleToNumber(String A) {
        
        int ans=0;
        int mult=1;
        
        for(int i=A.length()-1;i>=0;i--){
            ans+=mult*(A.charAt(i)-'A'+1);
            mult*=26;
        }
        
        return ans;
        
    }
}
