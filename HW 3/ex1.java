
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность Array List: ");
        int size = sc.nextInt();
        
        ArrayList <Integer> intarr = new ArrayList<>();  
        Random rnd = new Random(); 
        
        for (int i = 0; i < size; i++) {
            intarr.add(rnd.nextInt(100));
            
        }     
        int min = intarr.get(0);
        int max = intarr.get(0);
        double sredarif = 0;
        ArrayList <Integer> temparr = new ArrayList <> (intarr);
        System.out.println(intarr);

        short key = 0;
        while (key !=6){
        System.out.println("Выберите пукнт меню: ");
        System.out.println("1. Удалить чётные числа из массива");
        System.out.println("2. Найти минимальное значение");
        System.out.println("3. Найти максимальное значение");
        System.out.println("4. Найти среднее ариф. значение");
        System.out.println("5. Вывести элементы массива");
        System.out.println("6. Выход");
        key = sc.nextShort();
        switch (key) {
            case 1:
                for (int i = 0; i < intarr.size(); i++) {
                    if (intarr.get(i)%2 == 0){
                        intarr.remove(i);
                        i--;
                    }


                }
                System.out.println(intarr);
                break;
            case 2:
                temparr = intarr;
                temparr.sort(null);
                min = temparr.get(0);
                System.out.println("Минимальное значение = " + min);                                        
                break;
            case 3:
                temparr = intarr;
                temparr.sort(null);
                max = temparr.get(temparr.size()-1);
                System.out.println("Максимальное значение = " + max);
                break;
            case 4:
                for (Integer in : intarr) {
                    sredarif += in;
                    
                }
                sredarif = sredarif/size;
                System.out.println("Среднее арифметическое = " + sredarif);
                break;
            case 5:
                System.out.println(intarr);
                break;
            default:
                break;
        }
        }
    sc.close();





    }
}