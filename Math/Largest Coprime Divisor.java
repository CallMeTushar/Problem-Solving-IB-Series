public class Solution {
    public int cpFact(int A, int B) {
        
       int g=gcd(A,B);
        return g==1?A: cpFact(A/g,B);    

    }
    
    public int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
}
