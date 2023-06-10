import java.util.Scanner;

public class exs3 {
    
    public static void main(String[] args) {


        Scanner input_us = new Scanner(System.in);
        double result = 0;
        String operation;
        System.out.println("_____Калькулятор______");
        System.out.println("Все операции:   *  +   -   / ");
        System.out.print("Введите 1 число:   ");
        double first_num = input_us.nextInt();
        System.out.print("Введите 2 число:   ");
        double second_num = input_us.nextInt();
        System.out.print("Введите операцию:  ");


        switch (operation = input_us.next()) {
            case "*":
                    result = first_num * second_num;
                    break;
            case "/":
                    result = first_num / second_num;
                    break;
            case "+":
                    result = first_num + second_num;
                    break;
            case "-":
                    result = first_num - second_num;
                    break;
            default:
                    System.out.println("Неизвестная операция!!!");
            }

        System.out.printf("%d %s %d = %f", (int)first_num, operation, (int)second_num, result);        
        
    }

}


