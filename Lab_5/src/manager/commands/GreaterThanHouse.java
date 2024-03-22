package manager.commands;

import data.Flat;
import data.House;
import data.comparators.HousesComparator;
import data.generators.HouseGenerator;
import manager.CollectionManager;

import java.util.ArrayDeque;
import java.util.Comparator;

public class GreaterThanHouse implements Command{
    @Override
    public void execute(String[] args) throws Exception {
        House house = HouseGenerator.createHouse();
        ArrayDeque<Flat> arrayDeque = CollectionManager.getArrayDeque();
        Comparator<House> comparator = new HousesComparator();

        Integer counter = 0;

        for (Flat flat : arrayDeque){
            if (comparator.compare(house, flat.getHouse()) < 0 ) {
                counter++;
            }
        }

        System.out.println("Houses greater than your - " + counter);
    }

    @Override
    public String getName() {
        return "count_greater_than_house";
    }

    @Override
    public String getDescription() {
        return "вывести количество элементов, значение поля house которых больше заданного";
    }
}
