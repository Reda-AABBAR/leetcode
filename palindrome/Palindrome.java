public class Palindrome {
    public boolean isPalindrome(int x) {
        if(x >= 0){
            if(x < 10) return true;
            String xs = String.valueOf(x);
            int n = xs.length();
            for (int i = 0; i < n/2; i++) {
                if (xs.charAt(i) != xs.charAt(n-i-1)) return false;
            }
            return true;
        }

        return false;
    }

}
