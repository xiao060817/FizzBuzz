package lab1;

public class Multiples {
    public static void main(String[] args) {
        int a = multiples();
        System.out.println(a);
    }

    public static int multiples(int n, int b, int a) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 ||  i % b == 0) {
                count++;
            }

        }
        return count;
    }

    public static int multiples() {
        return multiples(1000, 3, 5);
    }

}
