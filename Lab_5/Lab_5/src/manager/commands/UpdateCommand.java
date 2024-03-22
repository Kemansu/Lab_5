package manager.commands;

import data.Flat;
import data.generators.FlatGenerator;
import exceptions.WrongInputException;
import manager.CollectionManager;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class UpdateCommand implements Command {
    @Override
    public void execute(String[] args) throws WrongInputException {
        if (args.length != 2 || CollectionManager.getArrayDeque().size() == 0 || Long.parseLong(args[1]) > CollectionManager.getArrayDeque().getLast().getId() || Long.parseLong(args[1]) < 0) {
            System.out.println("wrong id");
        } else {
            System.out.println("Let's update a flat!");
            Long neededId = Long.parseLong(args[1]);
            Object[] array = CollectionManager.getArrayDeque().toArray();
            Flat newflat = FlatGenerator.createFlat(neededId);
            array[(int) (neededId - 1)] = newflat;

            ArrayDeque<Flat> updatedArraydeque = new ArrayDeque<>();

            for (Object flat : array) {
                updatedArraydeque.add((Flat) flat);
            }
            CollectionManager.setArrayDeque(updatedArraydeque);
            System.out.println("Flat successfully update!");
        }

    }

    @Override
    public String getName() {
        return "update";
    }

    @Override
    public String getDescription() {
        return "обновить значение элемента коллекции, id которого равен заданному";
    }
}