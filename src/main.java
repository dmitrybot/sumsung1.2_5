import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        n = n % (3600 * 24);
        int h = n / 3600;
        int m = n / 60 % 60;
        int s = n % 60;
        System.out.println(h + ":" + m / 10 + "" + m % 10 + ":" + s / 10 + "" + s % 10);
    }
}