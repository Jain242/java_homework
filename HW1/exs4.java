
import java.util.Scanner;

public class exs4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String equation = "2? + ?5 = 58";
        int digit1 = 0;
        int digit2 = 0;
        int digit3 = 0;
        int digit4 = 0;
        int result = 0;
        int search_digit = -1;
        int index1 = equation.indexOf('?'); // 2
        
        if (index1 == 0){
            digit2 = Character.getNumericValue(equation.charAt(1));}
        else{
            digit1 = Character.getNumericValue(equation.charAt(0));
        }
        equation = equation.substring(5);
        index1 = equation.indexOf('?'); // 2
        if (index1 == 0){
            digit4 = Character.getNumericValue(equation.charAt(1));
        }
        else{
            digit3 = Character.getNumericValue(equation.charAt(0));
        }
        result = Character.getNumericValue(equation.charAt(5))*10 + Character.getNumericValue(equation.charAt(6));

        for (int i = 0; i < 10; i++) {
            if (digit2 == 0 && digit4 == 0){
                if (digit1*10 + i + digit3*10 + i == result){
                    System.out.println(digit1*10 + i + digit3*10 + i);
                   search_digit = i;
                   break;
                }
                } else if (digit1 == 0 && digit4 == 0){
                if (i*10 + digit2 + digit3*10 == result){
                   search_digit = i;
                   break;
                }
                }
            else if (digit2 == 0 && digit3 == 0){
                if (digit1*10 + i + i*10 + digit4== result){
                   search_digit = i;
                   break;
                }
                }
            else if (digit1 == 0 && digit3 == 0){
                if (i*10 + digit2 + i*10 + digit4 == result)    {
                    search_digit = i;
                    break;
                }   
                }
            
        }
                if (search_digit != -1) {
            System.out.println("Ваше число = " + search_digit);
        } else {
            System.out.println("Решение не найдено.");
        }


         scan.close();
    }


 
}
