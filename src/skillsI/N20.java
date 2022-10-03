package skillsI;

public class N20 {
    public boolean isValid(String s) {
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                flag += 1;
            } else if (s.charAt(i) == ')') {
                flag -= 1;
            } else if (s.charAt(i) == '[') {
                flag += 1;
            } else if (s.charAt(i) == ']') {
                flag -= 1;
            } else if (s.charAt(i) == '{') {
                flag += 1;
            } else if (s.charAt(i) == '}') {
                flag -= 1;
            }
        }
        return flag == 0;
    }
}


    class Test20 {
        public static void main(String[] args) {
            N20 n20 = new N20();
            System.out.println(n20.isValid("()[])({}"));
        }
    }