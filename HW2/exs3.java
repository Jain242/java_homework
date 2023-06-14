package HW2;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//         3) Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.



public class exs3 {
    public static void main(String[] args) {
        String filepath = "HW2\\log_exs3.txt";
        StringBuilder str2 = new StringBuilder("");   
        

    try (FileReader fr = new FileReader(filepath)){
        Scanner sc = new Scanner(fr);
        String str1 = sc.nextLine();
        str1 = str1.replace("{", "").replace("}", "").replace("\"","");
        changeString(str1, str2);
        fr.close(); 
    }
        
     catch (Exception e) {
        System.out.println("Ошибка чтения из файла!");
        
    } finally{
        System.out.println("Файл прочитан");
        
    }

     try (FileWriter write = new FileWriter(filepath, true)) {
        write.append("\n" + str2);


        
    } catch (Exception e) {
        System.out.println("Ошибка доступа к файлу!" + e.getMessage());
    }finally{
        System.out.println("Файл записан!");
        }  
    


    }

    public static void changeString(String str1, StringBuilder strfinal){
        String [] strtemp = str1.split(",");
        
        for (int i = 0; i < strtemp.length; i= i+3) {
            strfinal.append("Студент ").append(strtemp[i].substring(8)).append(" получил "+ strtemp[i+1].substring(7)).append(" по предмету "+ strtemp[i+2].substring(8)).append("\n");
            
        }




    }

}