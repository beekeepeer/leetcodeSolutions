package skillsI;

public class N20 {
    public boolean isValid(String s) {
        int flag1 = 0, flag2 = 0, flag3 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                flag1 += 1;
            } else if (s.charAt(i) == ')') {
                flag1 -= 1;
            } else if (s.charAt(i) == '[') {
                flag2 += 1;
            } else if (s.charAt(i) == ']') {
                flag2 -= 1;
            } else if (s.charAt(i) == '{') {
                flag3 += 1;
            } else if (s.charAt(i) == '}') {
                flag3 -= 1;
            }
            if(flag1 == -1 && flag2 == -1 && flag3 == -1){
                return false;
            }
        }
        return (flag1 == 0 && flag2 == 0 && flag3 == 0);
    }
}


    class Test20 {
        public static void main(String[] args) {
            N20 n20 = new N20();
            System.out.println(n20.isValid("()[]{}{}(]"));
        }
    }