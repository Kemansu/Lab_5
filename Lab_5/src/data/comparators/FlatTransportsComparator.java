package data.comparators;

import data.Flat;
import data.Transport;

import java.util.Comparator;

public class FlatTransportsComparator implements Comparator<Flat> {

    @Override
    public int compare(Flat flat1, Flat flat2) {
        Integer f1 = null;
        Integer f2 = null;


        if (flat1.getTransport() == Transport.NONE){
            f1 = 1;
        } else if (flat1.getTransport() == Transport.FEW) {
            f1 = 2;
        } else if (flat1.getTransport() == Transport.LITTLE) {
            f1 = 3;
        } else if (flat1.getTransport() == Transport.NORMAL) {
            f1 = 4;
        } else if (flat1.getTransport() == Transport.ENOUGH) {
            f1 = 5;
        }

        if (flat2.getTransport() == Transport.NONE){
            f2 = 1;
        } else if (flat2.getTransport() == Transport.FEW) {
            f2 = 2;
        } else if (flat2.getTransport() == Transport.LITTLE) {
            f2 = 3;
        } else if (flat2.getTransport() == Transport.NORMAL) {
            f2 = 4;
        } else if (flat2.getTransport() == Transport.ENOUGH) {
            f2 = 5;
        }


        return Integer.compare(f1, f2);

    }
}
