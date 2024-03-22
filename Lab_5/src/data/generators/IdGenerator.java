package data.generators;

import data.Flat;
import manager.CollectionManager;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class IdGenerator {
    public static Queue<Long> IdArray = new ArrayDeque<>();

    public static void Fuel(){
        ArrayList<Long> list = new ArrayList<>();
        for (long i = 1; i < ('9' * 64); i++){
            list.add(i);
        }

        // проверка на уникальность
        ArrayDeque<Flat> arrayDeque = CollectionManager.getArrayDeque();
        for (Flat flat : arrayDeque) {
            if (list.contains(flat.getId())) {
                list.remove(flat.getId());
            }
        }

        for (Long id : list) {
            IdArray.add(id);
        }

    }



    public static Long getId() {
        return IdArray.poll();
    }



}
