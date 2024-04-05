package manager.commands;

import data.Flat;
import data.comparators.FlatTransportsComparator;
import data.comparators.FlatsKitchenComparator;
import data.comparators.FlatTransportsComparator;
import manager.CollectionManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  Данная команда выводит значения поля transport всех элементвов в порядке возрастания
 *
 * @author Kemansu
 * @since 1.0
 */
public class PrintSortedTransport implements Command{
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
        Collections.sort(arrayList, new FlatTransportsComparator());

        for (Flat flat : arrayList) {
            System.out.println(flat.getTransport());
        }
    }

    @Override
    public String getName() {
        return "print_field_ascending_transport";
    }

    @Override
    public String getDescription() {
        return "вывести значения поля transport всех элементвов в порядке возрастания";
    }
}
