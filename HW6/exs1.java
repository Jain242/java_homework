/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих
*/

package HW6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import HW6.Shop.Notebook;

public class exs1{
    public static void main(String[] args) throws Exception {

        MenuMain();

    }

    private static void MenuMain() {
        Scanner inputData = new Scanner(System.in);
        Shop shop = new Shop();
        shop.insertRandom(20);
        int inputAction = -1;
        int countingFilter = 1;
        Map<String, Shop> filterLogs = new HashMap<>();

        System.out.println("Добро пожаловать!");
        while (true) {
            ActionsMenu();
            System.out.printf("Выберите действие: ");
            switch (inputAction = inputData.nextInt()) {
                case 1:
                    System.out.println(" Бренд | Процессор | Объем ОЗУ | Видеокарта | Объем ЖД | Операционная система | Цвет");
                    System.out.println(shop);
                    break;
                case 2:
                    Shop filtered = new Shop();
                    filtered.notebookArrayList = shop.filter();
                    filterLogs.put(Integer.toString(countingFilter++),filtered);
                    System.out.println(filtered);
                    break;    
                case 3:
                    if (filterLogs.size() != 0) {
                        System.out.println(logsJournal(filterLogs));
                    } else {
                        Message("Журнал пуст - не произвели ни одной фильтрации.");
                    }
                    break;
                case 4:
                    inputData.close();
                    System.exit(0);
                default:
                    System.out.println("Ошибка!");
                    break;
            }
        }        
    }

    private static Shop logsJournal(Map<String, Shop> filterLogs) {
        Scanner inputData = new Scanner(System.in);

        System.out.println(repeat(80, "="));
        System.out.println("Доступные прошлые поиски по номера:");
        System.out.println(filterLogs.keySet());
        System.out.println("");
        System.out.println(repeat(80, "="));

        System.out.printf("Выберите номер - ");
        String inputLogNum = inputData.next();
        return filterLogs.get(inputLogNum);
    }

    private static void ActionsMenu() {
        Message("1. Вывести все ноутбуки\n"+
                "2. Отфильтровать по критериям\n"+
                "3. Журнал прошлых поисков\n"+
                "4. Выход");
    }

    private static String repeat(int count, String with) {
        return new String(new char[count]).replace("\0", with);
    }

    private static void Message(String text) {
        System.out.println(repeat(30, "-"));
        System.out.println(text);
        System.out.println(repeat(30, "-"));
    }
    
}