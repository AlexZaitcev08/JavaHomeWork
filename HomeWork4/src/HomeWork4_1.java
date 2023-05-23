import java.util.Arrays;
import java.util.Scanner;

public class HomeWork4_1 {


    /*Найти в массиве самую длинную последовательность,
    состоящую из одинаковых элементов.
    Вывести на экран количество элементов самой длиной последовательности
    и номер элемента, который является ее началом.*/
    public static void main(String[] args) {
        System.out.println("Введите набор элементов: ");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char[] array = str.toCharArray();
        System.out.println("Ваш набор элементов состоит из: " + Arrays.toString(str.toCharArray()));
        int startIndex = 0;
        int countElements = 1;
        int maxStartIndex = 0;
        int maxLength = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i-1]){
                countElements++;
            }else {
                countElements = 1;
                startIndex = i;
            }
            if (countElements > maxLength){
                maxLength = countElements;
                maxStartIndex = startIndex;
            }
        }

        System.out.println("Количество элементов самой длиной последовательности: " + maxLength);
        System.out.println("Индекс стартового элемента последовательности: " + maxStartIndex);
        System.out.println("Элемент который повторяется - '" + array[maxStartIndex] + "'");

    }
}