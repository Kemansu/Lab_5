package manager.commands;

import data.Flat;
import data.comparators.FlatsComparator;
import data.generators.FlatGenerator;
import manager.CollectionManager;

import java.util.ArrayDeque;

public class RemoveLowerCommand implements Command{
    @Override
    public void execute(String[] args) throws Exception {
        FlatsComparator c = new FlatsComparator();
        Object[] array = CollectionManager.getArrayDeque().toArray();
        ArrayDeque<Flat> arrayDeque_new = new ArrayDeque<>();
        Integer k = 0;

        // Заданный параметр
        Flat flat_param = FlatGenerator.createFlat(0L);

        for (Object object : array){
            Flat flat = (Flat) object;
            if (c.compare(flat, flat_param) >= 0) {
                arrayDeque_new.add(flat);
            } else {
                k++;
            }
        }

        CollectionManager.setArrayDeque(arrayDeque_new);
        System.out.println("Collection was successfully changed!\nFlats deleted - " + k);
    }

    @Override
    public String getName() {
        return "remove_lower";
    }

    @Override
    public String getDescription() {
        return "удалить из коллекции все элементы, меньшие, чем заданный";
    }
}
