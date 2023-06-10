//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
//1 + 2 + 3 1*2*3

/**
 * exs1
 */



import java.util.Scanner;
public class exs1 {
    public static void main(String[] args) {
        Scanner inputnum = new Scanner(System.in);
        System.out.print("Введите число - ");
        int user_num = inputnum.nextInt();
        int summ = 0;
        int multiply = 1;
        for (int i = 1; i <= user_num; i++) {
            summ += i;
            multiply *= i;
            System.out.println(multiply);
        }
        System.out.printf("Сумма = " + summ + ", произведение  = " + multiply);
    }
}