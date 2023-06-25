
package HW5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exs1 {
    public static void main(String[] args) {
        Scanner input_us = new Scanner(System.in, "CP866");
        Map<String, ArrayList<String> >contactbook = new HashMap<String, ArrayList<String>>();
       
        int operation =4;
        while(operation !=3){
                System.out.println("");
                System.out.println("---------------------");
                System.out.println("Выберите пукнт меню: ");
                System.out.println("1. Добавить контакт");
                System.out.println("2. Вывести всю телефонную книгу");
                System.out.println("3. Выход");
                switch (operation = input_us.nextInt()) {
                case 1:
                        System.out.println("Введите фамилию контакта: ");  
                        String name = input_us.next();
                        System.out.println("Введите номер телефона контакта: ");
                        String phoneNumber = input_us.next();
                        if (contactbook.containsKey(name)){
                                ArrayList<String> phoneNumbers = contactbook.get(name);
                                phoneNumbers.add(phoneNumber);
                        } else {
                        // Если контакт с таким именем не существует, создайте новую запись в книге контактов
                        ArrayList<String> phoneNumbers = new ArrayList<>();
                        phoneNumbers.add(phoneNumber);
                        contactbook.put(name, phoneNumbers);
                        }

                        break;
                case 2:
                        for (Map.Entry<String, ArrayList<String>> entry : contactbook.entrySet()) {
                                String contactName = entry.getKey();
                                ArrayList<String> phoneNumbers = entry.getValue();
                                System.out.print(contactName + ": "); 
                                for (String string : phoneNumbers) {
                                        if (string.equals(phoneNumbers.get(phoneNumbers.size()-1))) {
                                            System.out.print( string + ".");   
                                            System.out.println("") ;  
                                        }
                                        else{
                                                System.out.print( string + ", ");    
                                        }
                                        
                                        
                                }

                        }

                        break;
                case 3:
                        break;

                default:
                        System.out.println("Неизвестная операция!!!");
                }


        }


    }
    
}
