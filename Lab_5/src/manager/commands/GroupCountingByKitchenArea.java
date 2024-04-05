package manager.commands;

import data.Flat;
import data.comparators.FlatsKitchenComparator;
import manager.CollectionManager;

import java.util.*;
/**
 *  Данная команда сгрупировывает элементы коллекции по значению поля kitchenArea, выводит количество элементов в каждой группе
 *
 * @author Kemansu
 * @since 1.0
 */

public class GroupCountingByKitchenArea implements Command{
    @Override
    public void execute(String[] args) throws Exception {
        // Начало
        List<Flat> arrayDeque_list = CollectionManager.getArrayDeque().stream().toList();
        ArrayList<Flat> arrayList = new ArrayList<>();

        // Считываем массив
        for (Flat flat : arrayDeque_list){
            arrayList.add(flat);
        }

        // Сортировка
        Collections.sort(arrayList, new FlatsKitchenComparator());

        // Задаем необходимые логические переменные
        HashMap<String, Integer> counts = new HashMap<>();
        Integer counter = 1;



        // прогоняем все через цикл
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i).getKitchenArea().equals(arrayList.get(i + 1).getKitchenArea())){
                counter++;
                if (arrayList.get(i + 1) == arrayList.get(arrayList.size() - 1)) {
                    counts.put(String.valueOf(arrayList.get(i).getKitchenArea()), counter);
                }
            } else {
                counts.put(String.valueOf(arrayList.get(i).getKitchenArea()), counter);
                if (arrayList.get(i + 1) == arrayList.get(arrayList.size() - 1)) {
                    counts.put(String.valueOf(arrayList.get(i + 1).getKitchenArea()), 1);
                }
                counter = 1;
            }
        }

        // Выводим результаты
        for (String key : counts.keySet()){
            System.out.println("Kitchen area: " + key + "; Amount: " + counts.get(key));
        }

        if (CollectionManager.getArrayDeque().size() == 1) {
            System.out.println("Kitchen area: " + arrayList.get(0).getKitchenArea() + "; Amount: " + "1");
        }

    }

    @Override
    public String getName() {
        return "group_counting_by_kitchen_area";
    }

    @Override
    public String getDescription() {
        return "сгруппировать элементы коллекции по значению поля kitchenArea, вывести количество элементов в каждой группе";
    }
}
