package lab1;

public class Reduce {
    public static void main(String[] args) {

        reduce();
    }

    public static void reduce(int n) {
        int count = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                count++;
                n = n / 2;
            } else {
                n = n - 1;
                count++;
            }
        }
        System.out.println(count);
    }
    public static void reduce() {
        reduce(100);
    }
}