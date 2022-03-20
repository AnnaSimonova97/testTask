package lesson;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Places place1 = new Places("Исаакиевский собор", 5, 10);
        Places place2 = new Places("Эрмитаж", 8, 11);
        Places place3 = new Places("Кунсткамера", 3.5, 4);
        Places place4 = new Places("Петропавловская крепость", 10, 7);
        Places place5 = new Places("Ленинградский зоопарк", 9, 15);
        Places place6 = new Places("Медный всадник", 1, 17);
        Places place7 = new Places("Казанский собор", 4, 3);
        Places place8 = new Places("Спас на крови", 2, 9);
        Places place9 = new Places("Зимний дворец Петра 1", 7, 12);
        Places place10 = new Places("Зоологический музей", 5.5, 6);
        Places place11 = new Places("Музей обороны и блокады Ленинграда", 2, 19);
        Places place12 = new Places("Русский музей", 5, 8);
        Places place13 = new Places("Навестить друзей", 12, 20);
        Places place14 = new Places("Музей восковых фигур", 2, 13);
        Places place15 = new Places("Литературно-мемориальный музей Ф.М. Достоевского", 4, 2);
        Places place16 = new Places("Екатериниский дворец", 1.5, 5);
        Places place17 = new Places("Петербургский музей кукол", 1, 14);
        Places place18 = new Places("Музей микроминиатюры 'Русский Левша'", 3, 18);
        Places place19 = new Places("Всероссийский музей А.С. Пушкина и филиалы", 6, 1);
        Places place20 = new Places("Музей современного искусства Эрарта", 7, 16);

        List<Places> placesList = new ArrayList<>();
        placesList.add(place1);
        placesList.add(place2);
        placesList.add(place3);
        placesList.add(place4);
        placesList.add(place5);
        placesList.add(place6);
        placesList.add(place7);
        placesList.add(place8);
        placesList.add(place9);
        placesList.add(place10);
        placesList.add(place11);
        placesList.add(place12);
        placesList.add(place13);
        placesList.add(place14);
        placesList.add(place15);
        placesList.add(place16);
        placesList.add(place17);
        placesList.add(place18);
        placesList.add(place19);
        placesList.add(place20);

        Collections.sort(placesList);

        System.out.println("--------------Маршрут для первого дня------------------");

        List<Places> firstList = place1.getListOfPlaceInDay(placesList);
        for (Places p : firstList)
            System.out.println(p);

        List<Places> secondListAll = placesList;
        secondListAll.removeAll(firstList);
//        System.out.println(secondListAll);
        System.out.println("-----------Маршрут для второго дня--------------------");
        List<Places> secondList = place1.getListOfPlaceInDay(secondListAll);
        for (Places p : secondList)
            System.out.println(p);
    }
}
