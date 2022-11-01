public class HomeWork4Task5 {

    public static void main(final String[] args) {

        int symmetrical = 0;
        for (int hr = 0; hr < 24; hr++) {
            for (int min = 0; min <= 59; min++) {
                if (hr / 10 % 10 == min % 10 & hr % 10 == min / 10 % 10) {
                    symmetrical++;
                }
            }
        }
        System.out.println("The number of symmetrical combinations is " + symmetrical);
    }
}
