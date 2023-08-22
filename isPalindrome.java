package caseLabWork;

public class isPalindrome {
    public static boolean mein(String str) {
        int length = str.length();
        for (int i = 0; i < length/2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
