package HW2;

import java.util.Scanner;
import java.io.FileWriter;


public class exs4 {
    
        public static void main(String[] args) {
            
        
       Scanner input_us = new Scanner(System.in);
       String filepath = "HW2\\calculatorlog.txt";
        double result = 0;
        String operation;
        System.out.println("_____Калькулятор______");
        System.out.println("Все операции:   *  +   -   / ");
        System.out.print("Введите 1 число:   ");
        double first_num = input_us.nextInt();
        System.out.print("Введите 2 число:   ");
        double second_num = input_us.nextInt();
        System.out.print("Введите операцию:  ");
        operation = input_us.next();
        try (FileWriter writ = new FileWriter(filepath, true)){
                    switch (operation ) {
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
        String resaultstr =  first_num + " " + operation + " " + second_num + " = " +  result +"\n";
             writ.write(resaultstr);
        System.out.printf("%d %s %d = %f", (int)first_num, operation, (int)second_num, result);    
            }
             catch (Exception e) {
            System.out.println("Ошибка записи в файл!!");
        } finally{
            System.out.println();
            System.out.println("Задача завершена!");
        }

    
        input_us.close();

    }

}
