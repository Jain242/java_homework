package HW2;

import java.util.Scanner;

public class exs1 {
    /**
     */
    public static void main(String[] args) {
// 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для 
//фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"0"}
// Пример вывода: "select * from students WHERE name = Ivanov AND country = Russia.....".
        Scanner scan = new Scanner(System.in);
        String stringch = scan.nextLine();
        System.out.println(stringch);
        StringBuilder searchstring = new StringBuilder("select * from students WHERE ");   
        String [] newstr = stringch.replace('"',' ').split(",");
        String [] strtemp = newstr[0].split(":");
        for (int i = 1; i < newstr.length; i++) {
            strtemp = newstr[i].split(":");
              System.out.println(i);
            strtemp[0] = strtemp[0].trim();
            strtemp[1] = strtemp[1].trim();
            System.out.println(strtemp[0]);
            System.out.println(strtemp[1]);
            if (!strtemp[1].equalsIgnoreCase("null")){
                searchstring.append(strtemp[0]).append(" = ").append(strtemp[1]);
               
               }
              if (i != newstr.length -1 & !strtemp[1].equalsIgnoreCase("null")){
                searchstring.append(" AND "); 
            }
            
        System.out.println(searchstring);
        
    }
    scan.close();
}


}