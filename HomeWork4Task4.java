public class HomeWork4Task4 {

    public static void main(final String[] args) {

        int n, j;
        j = 0;
        for (int i = 1; i < 100000; i++) {
            n = i;
            while (n != 0) {
                if (n % 10 == 4 || n % 100 == 13) {
                    j++;
                    break;
                }
                n = n / 10;
            }
        }
        System.out.println("Exclude numbers: " + j);
    }
}
