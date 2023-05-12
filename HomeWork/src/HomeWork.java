import java.util.Scanner;
public class HomeWork {
    public static void fun1() {
        // /**
        // * Тривиальная (3 балла).
        // *
        // * Задача имеет повышенную стоимость как первая в списке.
        // *
        // * Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
        // * Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
        // */
        // * fun seconds(hours: Int, minutes: Int, seconds: Int): Int = TODO()

        Scanner in = new Scanner(System.in);
        System.out.print("Input hours: ");
        int hours = in.nextInt();
        System.out.print("Input minutes: ");
        int minutes = in.nextInt();
        System.out.print("Input seconds: ");
        int seconds = in.nextInt();
        System.out.println("Hours: " + hours + " Minutes: " + minutes + " Seconds: " + seconds);
        int sum = (hours * 3600) + (minutes * 60) + seconds;
        System.out.println("Seconds have pass: " + sum);
    }
    public static <string> void fun2() {
        //**
        // * Простая (2 балла)
        // *
        // * Пользователь задает целое трехзначное число (например, 478).
        // * Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
        // */
        // * fun numberRevert(number: Int): Int = TODO()

        Scanner in = new Scanner(System.in);
        System.out.print("Введите Ваше трехзначное число: ");
        int number = in.nextInt();
        String num = Integer.toString(number);
        String reverse = new StringBuffer(num).reverse().toString();
        System.out.print("Ваше число: " + number + " Ваше число перевертышь: " + reverse);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Какую функцию нужно выполнить 1 или 2? : ");
        int Function = in.nextInt();
        if(Function == 1){
            System.out.println("Выполняю первую функцию!");
            fun1();
        }
        if(Function == 2){
            System.out.println("Выполняю вторую функцию!");
            fun2();
        }
        else {
            System.out.print("Неправильно выбрана функция!! Попробуйте снова!");
        }
    }

}