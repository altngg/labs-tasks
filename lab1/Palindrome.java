
public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            isPalindrome(s);
            System.out.println(isPalindrome(s));            
        }
    }
    public static String reverseString(String s) {
        String reverse = "";
        for(int i =0; i< s.length(); i++) {
            reverse = s.charAt(i) + reverse;
        }
        return reverse;
            
        
    }
    public static boolean isPalindrome(String s) {
        return reverseString(s).equals(s);

    }
}
