import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String soal = sc.next();

if (soal.equals("Soal1")) {
    int a = sc.nextInt();
    int b = sc.nextInt();

    if ((b > 0 && a > Integer.MAX_VALUE - b) ||
        (b < 0 && a < Integer.MIN_VALUE - b)) {
        System.out.println("OVERFLOW");
    } else {
        System.out.println(a + b);
    }
}
else if (soal.equals("Soal2")) {
    double x = sc.nextDouble();
    double y = sc.nextDouble();

    float f = (float)x + (float)y;
    double d = x + y;

    double selisih = Math.abs(f - d);
    System.out.printf("%.6f\n", selisih);
}
else if (soal.equals("Soal3")) {
    int N = sc.nextInt();

    Integer a = N;
    Integer b = a;

    a = a + 1;

    System.out.println("==: " + (a == b));
    System.out.println("equals: " + a.equals(b));
}
else if (soal.equals("Soal4")) {
    String S = sc.next();

    String a = S;
    String b = new String(S);

    a = a + "X";

    System.out.println("==: " + (a == b));
    System.out.println("equals: " + a.equals(b));
}
else if (soal.equals("Soal5")) {
    int i = sc.nextInt();
    double d = sc.nextDouble();
    boolean val = sc.nextBoolean();

    double hasil = i * d;

    if (!val) {
        hasil = hasil * -1;
    }

    System.out.printf("%.2f\n", hasil);
}
    }
}
