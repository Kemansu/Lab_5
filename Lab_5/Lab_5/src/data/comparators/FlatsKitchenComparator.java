package data.comparators;

import data.Flat;

import java.util.Comparator;

public class FlatsKitchenComparator implements Comparator<Flat> {
    @Override
    public int compare(Flat flat1, Flat flat2) {
        return flat1.getKitchenArea().compareTo(flat2.getKitchenArea());
    }
}
