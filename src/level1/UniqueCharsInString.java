package level1;

public class UniqueCharsInString {

    public static void main(String[] args) {
        boolean isUnique = areAllCharactersUnique("abcdae");
        System.out.println(isUnique);
    }

    public static boolean areAllCharactersUnique(String str) {
        if (str == null || str.length() == 1) {
            return true;
        }
        boolean[] checkerArray = new boolean[256];
        for (int i=0; i<str.length(); i++) {
            int currChar = str.charAt(i);
            if (checkerArray[currChar]) {
                return false;
            }
            checkerArray[currChar] = true;
        }
        return true;
    }
/*

    if (str == null) {
        return true;
    }
    char[] chars = str.toCharArray();
    HashSet<Character> characterHashSet = new HashSet<>();
        for (int i=0; i<chars.length; i++) {
        char currChar = chars[i];
        if (characterHashSet.contains(currChar)) {
            return false;
        } else {
            characterHashSet.add(currChar);
        }
    }
        return true;
*/
}
