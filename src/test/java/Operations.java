public class Operations {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        int i = 10;
        double d = 3.5;
        System.out.println(i + d * 2 - i / 3.0 + (i % 4));

        int x = 10, y = 20, z = 10;

        System.out.println("x < y  → " + (x < y));
        System.out.println("y > x  → " + (y > x));
        System.out.println("x >= z → " + (x >= z));
        System.out.println("y <= z → " + (y <= z));
        System.out.println("x между 5 и 15 → " + (x >= 5 && x <= 15));
        System.out.println("x вне диапазона 5–15 → " + (x < 5 || x > 15));

        int max = Integer.MAX_VALUE;
        System.out.println("max = " + max);
        System.out.println("max + 1 = " + (max + 1));

        double big = Double.MAX_VALUE * 2;
        System.out.println("Double.MAX_VALUE * 2 = " + big);
    }
}
