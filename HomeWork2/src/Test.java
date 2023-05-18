import java.util.Scanner;
public class Test {
public static void main(String[]args) {
    getFactorial();

}
    public static void getFactorial() {
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

}
