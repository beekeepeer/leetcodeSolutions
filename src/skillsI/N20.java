package skillsI;

public class N20 {
    public boolean isValid(String s) {
        s = s.replaceAll("\\(\\)", "").replaceAll("\\[\\]", "").replaceAll("\\{\\}", "");
        if(s.length() > 0){
            return false;
        }
        return true;
        }
    }


class Test20 {
    public static void main(String[] args) {
        N20 n20 = new N20();
        System.out.println(n20.isValid("()[]{}"));
    }
}