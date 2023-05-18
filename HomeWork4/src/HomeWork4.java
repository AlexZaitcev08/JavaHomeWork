import java.util.Scanner;

public class HomeWork4 {
    /**
     * Сложная (5 баллов)
     * <p>
     * Перевести натуральное число n > 0 в римскую систему.
     * Римские цифры: 1 = I, 4 = IV, 5 = V, 9 = IX, 10 = X, 40 = XL, 50 = L,
     * 90 = XC, 100 = C, 400 = CD, 500 = D, 900 = CM, 1000 = M.
     * Например: 23 = XXIII, 44 = XLIV, 100 = C
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число, которое нужно перевести в римскую: ");
        int number = in.nextInt();
        String romanNum = convertToRoman(number);
        System.out.println("Ваше число: " + number);
        System.out.println("Число в римском исчислении: " + romanNum);
    }
    public static String convertToRoman(int number){
        int [] arabNum = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] romanSymb = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String romanNum = "";
        int i = 0;
        while (number >0){
            if (number >= arabNum[i]){
                romanNum += romanSymb[i];
                number -= arabNum[i];
            }
            else {
                i++;
            }
        }
        return romanNum;
    }
}
