package skillsI;

public class N1523 {
    public int countOdds(int low, int high) {
        int odds = 0;
        if (low % 2 == 0 && high % 2 == 0) {
            return (high - low) / 2;
        } else {
            return (high - low) / 2 + 1;
        }
    }
}
