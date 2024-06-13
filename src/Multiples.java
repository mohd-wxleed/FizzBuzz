public class Multiples {
    public static void main(String[] args) {
        long i = 1;
        long amount = 0;
        while (i < 1000) {
            if (i % 3 == 0  || i % 5 == 0) {
                amount += 1;
            }
            System.out.println(i);
            i += 1;

        }
        System.out.println(amount);
    }
}
