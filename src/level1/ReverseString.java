package level1;

public class ReverseString {

    public static void main(String[] args) {
        String reversedStr = reverseString("abcdefg");
        System.out.println(reversedStr);
    }

    public static String reverseString(String str){
        if (str == null) {
            return null;
        }
        String inputString = str;
        String outputString = new String();
        for (int i=inputString.length()-1; i>=0; i--) {
            outputString = outputString + inputString.charAt(i);
        }
        return outputString;
    }

}
