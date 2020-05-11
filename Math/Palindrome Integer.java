public class Solution {
    public int isPalindrome(int n) {
        
        if(n<0)
        return 0;
        
        String str=n+"";
        int lo=0,hi=str.length()-1;
        
        while(lo<hi){
        
        if(str.charAt(lo++)!=str.charAt(hi--))
        return 0;
            
        }
        
        return 1;
        
        
    }
}
