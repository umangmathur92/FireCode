package level1;

public class ReplaceAllSpaces {

    public static void main(String[] args) {
        String inputStr = "My name is Umang Mathur";
        String replacementStr = "ABC";
        String outputStr = replace(inputStr, replacementStr);
        System.out.println(outputStr);
    }

    public static String replace(String a, String b) {
        StringBuilder strBuilder = new StringBuilder();
        char[] chars = a.toCharArray();
        for (char currChar : chars) {
            strBuilder.append(currChar == ' ' ? b : currChar);
        }
        return strBuilder.toString();
    }
}
