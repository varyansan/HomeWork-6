public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");

        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }

        System.out.println("Задача №2");

        for (int b = 10; b >= 1; b = b - 1){
            System.out.println(b);
        }

        System.out.println("Задача №3");

        for (int x = 0; x < 17; x = x + 2){
            System.out.println("Четными числами являются " + x);
        }

        System.out.println("Задача №4");

        for (int c = 10; c >= -10; c = c - 1) {
            System.out.println(c);
        }

        System.out.println("Задача №5");

        for (int y = 1904; y < 2096; y = y + 4) {
            System.out.println(y + " год является високосным.");
        }

        System.out.println("Задача №6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("Задача №7");

        for (int t = 1; t <= 512; t = t * 2) {
            System.out.println(t);
        }

        System.out.println("Задача №8");
        int savings = 29000;
        int total = 0;

        for (int f = 0; f < 12; f++) {
            total = total + savings;
            System.out.println("Месяц " + f + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задача №9");
        int savings2 = 29000;
        int total2 = 0;

        for (int k = 0; k < 12; k++) {
            total2 = total2 + total2/100;
            total2 = total2 + savings2;
            System.out.println("Месяц " + k + ", сумма накоплений равна " + total2 + " рублей");
        }

        System.out.println("Задача №10");

        for (int n = 2; n <= 20; n = n + 1 * 2) {
            System.out.println(n);
        }

    }

}