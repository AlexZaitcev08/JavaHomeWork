import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args) {
//        quadraticRootNumber();
//        isNumberHappy();
//        getFactorial();
//        numbersCoprime();
//        sumNum();
    }


    public static void quadraticRootNumber() {
        //Найти число корней квадратного уравнения ax^2 + bx + c = 0
        double a = 1;
        double b = 6;
        double c = 4;
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("Нет корней");
        }
        if (discriminant == 0) {
            double x = (-(b) + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Уравнение имеет 1 корень: \n x = " + x);
        }
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Уравнение имеет 2 корня: \n x1= " + x1 + "\n x2= " + x2);

        }
    }

    public static void isNumberHappy() {
        //Четырехзначное число назовем счастливым, если сумма первых двух ее цифр равна сумме двух последних.
        //Определить, счастливое ли заданное число, вернуть true, если это так.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        int n = in.nextInt();

        if (n < 1000 || n > 9999) {
            System.out.println("Число введено не верно!");
        }

        if (n / 1000 + n % 1000 / 100 == n % 100 / 10 + n % 10) {
            System.out.println("Число счастливое");
        } else if (n / 1000 + n % 1000 / 100 != n % 100 / 10 + n % 10) {
            System.out.println("Число неудачное!");
        }
    }

    public static void getFactorial() {
        //Вычисление факториала
        Scanner in = new Scanner(System.in);
        System.out.print("Введите числа для вычисления факториала: ");
        int n = in.nextInt();
        System.out.printf("%d! = %d", n, factorial(n));
    }
    public static long factorial(int f) {
        long result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
    public static void numbersCoprime() {
        //Определить, являются ли два заданных числа m и n взаимно простыми.
        //Взаимно простые числа не имеют общих делителей, кроме 1.
        //Например, 25 и 49 взаимно простые, а 6 и 8 -- нет.

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число m: ");
        int m = in.nextInt();
        System.out.println("Введите число n: ");
        int n = in.nextInt();
        int max;
        int d = 0;
        if (m >= n) {
            max = m;
        } else {
            max = n;
        }
        for (int i = 2; i <= max; i++) {
            if (m % i == 0 && n % i == 0) d++;
        }
        if (d == 0) {
            System.out.println("Взаимно простые");
        } else {
            System.out.println("Не взаимно простые");
        }
    }
    public static void sumNum() {
        //Найти количество цифр в заданном числе n.
        //Например, число 1 содержит 1 цифру, 456 -- 3 цифры, 65536 -- 5 цифр.
        //Использовать операции со строками в этой задаче запрещается.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = in.nextInt();
        int x = 0;
        for (; n != 0; n /= 10) ++x;
        System.out.println("Число содержит " + x + " цифр(ы)!");
    }


}




