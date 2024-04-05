package manager.commands;

import data.Flat;
import data.comparators.*;
import data.generators.FlatGenerator;
import data.generators.IdGenerator;
import manager.CollectionManager;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
/**
 * Данная команда добавляет новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции
 *
 * @author Kemansu
 * @since 1.0
 */
public class AddIfMinCommand implements Command{
    @Override
    public void execute(String[] args) throws Exception {
        // Преобразуем коллекцию в лист
        List<Flat> arrayDeque_list = CollectionManager.getArrayDeque().stream().toList();

        // Проверка на минимум (через сортировку)
        FlatsComparator c = new FlatsComparator();
        Flat min_flat = arrayDeque_list.stream().min(c).get();

        Flat flat = FlatGenerator.createFlat(0L);

        if (c.compare(flat, min_flat) < 0) {
            flat.setId(IdGenerator.getId());
            CollectionManager.add(flat);
            System.out.println("Flat successfully added!");
        } else {
            System.out.println("Flat did not suit :(");
        }



    }

    @Override
    public String getName() {
        return "add_if_min";
    }

    @Override
    public String getDescription() {
        return "добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции";
    }
}
