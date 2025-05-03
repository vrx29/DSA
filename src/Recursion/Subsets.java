package Recursion;

public class Subsets {
    public static void main(String[] args) {
        String str = "baccad";
        System.out.println(skipCharacter(str, 'a', 0));
    }

    static String skipCharacter(String str, Character ch, int index) {
        if(index == str.length()) return "";
        if (str.charAt(index) == ch) {
            return skipCharacter(str, ch, index + 1);
        }
        return str.charAt(index) + skipCharacter(str, ch, index + 1);

    }
}
