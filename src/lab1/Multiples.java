package lab1;

public class Multiples {
    public static void main(String[] args) {
        int i = 0;
        int a = 0;
        while (i <= 100) {
            if (i % 3 == 0 ||  i % 5 == 0) {
                a++;
            }
            i++;
        }
        System.out.println(a);
    }

}
