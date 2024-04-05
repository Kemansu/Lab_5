package data.comparators;

import data.Flat;
import data.Transport;

import java.util.Comparator;
/**
 * Данный comparator объекты типа Flat дома между собой по полю Transport
 *
 * @author Kemansu
 * @since 1.0
 */
public class FlatTransportsComparator implements Comparator<Flat> {

    @Override
    public int compare(Flat flat1, Flat flat2) {

        return flat1.getTransport().compareTo(flat2.getTransport());

    }
}
