public class Solution {
   public int maxSubArray(final int[] arr) {
        
        int ms=Integer.MIN_VALUE;
        int cs=0;
        
        
        for(int i=0;i<arr.length;i++) {
            
            cs+=arr[i];
            
            ms=Math.max(ms, cs);
            
            if(cs<0)
                cs=0;
            
        }
        
        
        return ms;
        
        
    }

}
