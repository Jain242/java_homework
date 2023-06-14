package HW2;
//import java.util.Scanner;

import java.io.FileWriter;

public class exs2 {
    public static void main(String[] args) {
    //  2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.   
        String pathfile = "HW2\\sort_log.txt";

       int[] array = {5, 2,32, 20, 41, 8, 12, 1, 6};
        System.out.println("Дан массив: ");
        for (int i:array){
        System.out.print(" "+ i +" ");

        }
        System.out.println();
        BubbleSort(array, pathfile);

        

    }

    public static void BubbleSort(int [] array, String pathfile){
        int len = array.length;

        try (FileWriter writ = new FileWriter(pathfile)){
       
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j <  len - i -1 ; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }


                }
                 writ.write("Итерация " + (i + 1) + ": ");
                for (int num : array) {
                    writ.write(num + " ");
                
                }
                writ.write("\n");
            
        
        }} 
          catch (Exception e) {
            System.out.println("Ошибка записи в лог-файл: " + e.getMessage());
        }
   
            
    }






}

   
