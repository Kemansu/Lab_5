package data.comparators;

import data.House;

import java.util.Comparator;

public class HousesComparator implements Comparator<House> {

    @Override
    public int compare(House house1, House house2) {
        return house1.getNumberOfFlatsOnFloor().compareTo(house2.getNumberOfFlatsOnFloor());
    }
}
