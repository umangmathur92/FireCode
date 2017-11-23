package level1;

public class PalindromeTester {

    public static void main(String[] args) {
        boolean isPalindrome = isStringPalindrome("abcxdcba");
        System.out.println(isPalindrome);
    }

    public static boolean isStringPalindrome(String str){
        if (str == null || str.length() == 0) {
            return true;
        }
        int strLen = str.length();
        for (int i=0; i<strLen/2; i++) {
            char char1 = str.charAt(i);
            char char2 = str.charAt(strLen - 1 - i);
            if (char1 != char2) {
                return false;
            }
        }
        return true;
    }
}
