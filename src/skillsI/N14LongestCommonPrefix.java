package skillsI;

public class N14LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}

class Test {

    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};
        N14LongestCommonPrefix n14 = new N14LongestCommonPrefix();
        System.out.println(n14.longestCommonPrefix(strs));


    }
}