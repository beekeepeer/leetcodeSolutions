package skillsI;

import java.util.ArrayDeque;

public class N20 {
    public boolean isValid(String s) {
        if (s.length() < 2) return false;
        ArrayDeque<Character> collection = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                collection.add(s.charAt(i));
            } else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                if(collection.size() <= 0){
                    return false;
                }
                char catchIt = collection.pollLast();
                if(catchIt == '('){
                    if(s.charAt(i) != ')'){
                        return false;
                    }
                } else if(catchIt == '['){
                    if(s.charAt(i) != ']'){
                        return false;
                    }
                } else if(catchIt == '{'){
                    if(s.charAt(i) != '}'){
                        return false;
                    }
                }
            }
        }
        return collection.isEmpty();
    }
}


    class Test20 {
        public static void main(String[] args) {
            N20 n20 = new N20();
            System.out.println(n20.isValid(")(){}"));
        }
    }