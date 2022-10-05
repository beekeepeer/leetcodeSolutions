package skillsI;

public class N1790 {
    static String s1 = "kaleb";
    static String s2 = "kebal";
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        if(s1.equals(s2)) return true;
        int count = 0;
        int charSum1 = 0;
        int charSum2 = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.indexOf(s2.charAt(i)) == -1 || s2.indexOf(s1.charAt(i)) == -1){
                return false;
            } else if (s1.charAt(i) != s2.charAt(i)){
                count++;

                if(count == 1){
                    charSum1 = s1.charAt(i) + s2.charAt(i);
                } else {
                    charSum2 = s1.charAt(i) + s2.charAt(i);
                }

                if (count == 2 && charSum1 != charSum2) return false;

                if (count == 3) return false;


            }
        }
        return count == 2 || count == 0;
        }



    public static void main(String[] args) {
        N1790 t = new N1790();
        System.out.println(t.areAlmostEqual(s1, s2));
    }
}
