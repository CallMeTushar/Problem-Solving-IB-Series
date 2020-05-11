public class Solution {
    public String convertToTitle(int n) {

        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(num(n % 26));
            n =(n-1)/ 26;
        }

        return sb.reverse().toString();

    }
    
    public char num(int n) {
        return (char) ((n + 25) % 26 + 'A');
    }
}
