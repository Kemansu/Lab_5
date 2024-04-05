package manager.commands;

import data.Flat;
import data.generators.FlatGenerator;
import exceptions.WrongInputException;
import manager.CollectionManager;

import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 *  Данная команда удаляет из коллекции элемент, по заданному id
 *
 * @author Kemansu
 * @since 1.0
 */
public class RemoveCommand implements Command{
    @Override
    public void execute(String[] args) {
        if (args.length != 2 || CollectionManager.getArrayDeque().size() == 0 || Long.parseLong(args[1]) > CollectionManager.getArrayDeque().getLast().getId() || Long.parseLong(args[1]) < 0) {
            System.out.println("wrong id");
        } else {
            Long neededId = Long.parseLong(args[1]);
            Object[] array = CollectionManager.getArrayDeque().toArray();

            // заносим все в обновленный массив
            ArrayDeque<Flat> updatedArraydeque = new ArrayDeque<>();

            for (Object object : array) {
                Flat flat = (Flat) object;
                if (flat.getId() != neededId) {
                    updatedArraydeque.add(flat);
                }
            }
            CollectionManager.setArrayDeque(updatedArraydeque);
            System.out.println("Flat successfully remove!");
        }
    }

    @Override
    public String getName() {
        return "remove_by_id";
    }

    @Override
    public String getDescription() {
        return "удалить элемент из коллекции по его id";
    }
}
