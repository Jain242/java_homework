
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Scanner;

public class exs1 {
    public static void main(String[] args){
        // Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
        // 1) Умножьте два числа и верните произведение в виде связанного списка.
        // 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа могут быть отрицательными.
        Scanner sq = new Scanner(System.in);
        ArrayDeque<Integer> dq1 = new ArrayDeque<Integer>();
        ArrayDeque<Integer> dq2 = new ArrayDeque<Integer>();

        System.out.println("Введите элементы 1 очереди");
        for (int i = 0; i < 3; i++) {
            
            dq1.add(sq.nextInt());
            
        }
        System.out.println("Первая очередь равна " + dq1);
         System.out.println("Введите элементы 2 очереди");
        for (int i = 0; i < 3; i++) {
            dq2.add(sq.nextInt());
        }
        System.out.println("Вторая очередь равна " + dq2);
        System.out.println("Произведение чисел " + Multiplai(dq1, dq2));

        System.out.println("Введите элементы 1 очереди");
        for (int i = 0; i < 3; i++) {
            dq1.add(sq.nextInt());
        }
        System.out.println("Первая очередь равна " + dq1);
        System.out.println("Введите элементы 2 очереди");
        for (int i = 0; i < 3; i++) {
            dq2.add(sq.nextInt());
        }
        System.out.println("Вторая очередь равна " + dq2);
        System.out.println("Сумма чисел " + Summa(dq1, dq2));

        sq.close();
    }
    
    public static LinkedList <Integer> Multiplai(ArrayDeque <Integer> dq1, ArrayDeque <Integer> dq2){   

            String digit1 = "";
            String digit2 = "";
            for (int i = 0; i < 3; i++) {
                digit1 = digit1 + dq1.removeLast().toString();
                digit2 = digit2 + dq2.removeLast().toString();           
            }
            StringBuilder resultstr = new StringBuilder(Integer.toString(Integer.parseInt(digit1) *  Integer.parseInt(digit2)));
            System.out.println(resultstr);
            LinkedList <Integer> ls = new LinkedList<>();
            while(!resultstr.isEmpty()){
                ls.add(Character.digit(resultstr.charAt(0),10));
                resultstr.deleteCharAt(0);
            }
            return ls;

    }

    public static LinkedList <Integer> Summa(ArrayDeque <Integer> dq1, ArrayDeque <Integer> dq2){
            String digit1 = "";
            String digit2 = "";
            Integer ch1;
            Integer ch2;
            short znak1 = 1;
            short znak2 = 1;
            for (int i = 0; i < 3; i++) {
                ch1 = dq1.removeLast();
                ch2 = dq2.removeLast();
                if (ch1<0){
                    znak1 = -1;
                    ch1 = -1*ch1;
                }
                if (ch2<0){
                    znak2 = -1;
                    ch2 = -1*ch2;
                }
                digit1 = digit1 + ch1.toString();
                digit2 = digit2 + ch2.toString();           
            }
            System.out.println(digit1);
            System.out.println(digit2);
            StringBuilder resultstr1 = new StringBuilder(Integer.toString(Integer.parseInt(digit1)*znak1 +  Integer.parseInt(digit2)*znak2));
            System.out.println(resultstr1);
            LinkedList <Integer> ls = new LinkedList<>();
            while(!resultstr1.isEmpty()){
                ls.add(Character.digit(resultstr1.charAt(0),10));
                resultstr1.deleteCharAt(0);
            }
            return ls;

    }
}
