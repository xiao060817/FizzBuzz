package lab1;

public class Reduce {
    public static void main(String[] args) {
        int a = reduce();
        System.out.println(a);
    }

    public static int reduce(int n) {
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
       return (count);
    }
    public static int reduce() {
        return reduce(100);
    }
}