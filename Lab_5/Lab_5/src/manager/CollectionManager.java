package manager;

import data.Flat;

import java.time.LocalDate;
import java.util.ArrayDeque;

public class CollectionManager {
    private static ArrayDeque<Flat> arrayDeque;

    private static LocalDate date;

    public CollectionManager() {
        arrayDeque = new ArrayDeque<>();
        date = LocalDate.now();
    }

    public static LocalDate getInitDate() {
        return date;
    }

    public static void setArrayDeque(ArrayDeque<Flat> arrayDeque) {
        CollectionManager.arrayDeque = arrayDeque;
    }

    public static void add(Flat flat) {
        arrayDeque.add(flat);
    }

    public static void clear() {
        arrayDeque.clear();
    }

    public static ArrayDeque<Flat> getArrayDeque() {
        return arrayDeque;
    }
}
