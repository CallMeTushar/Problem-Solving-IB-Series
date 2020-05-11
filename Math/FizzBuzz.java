public class Solution {
    public String[] fizzBuzz(int n) {
        
        String[]arr=new String[n];
        
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            
            int val=i+1;
            boolean flag=false;
            
            if(val%3==0){
                sb.append("Fizz");
                flag=true;
            }
            
            
            if(val%5==0){
                sb.append("Buzz");
                flag=true;
            }
            
            if(!flag){
                sb.append(val);
            }
            
            arr[i]=sb.toString();
            
            
        }
        
        return arr;
        
        
    }
}
