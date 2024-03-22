package data.comparators;

import data.Flat;
import data.Transport;

import java.util.Comparator;

public class FlatTransportsComparator implements Comparator<Flat> {

    @Override
    public int compare(Flat flat1, Flat flat2) {

        return flat1.getTransport().compareTo(flat2.getTransport());

    }
}
