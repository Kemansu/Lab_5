package manager.commands;

import data.Flat;
import manager.CollectionManager;

import java.util.ArrayDeque;
/**
 *  Данная команда выводит все элементы коллекции
 *
 * @author Kemansu
 * @since 1.0
 */
public class ShowCommand implements Command{
    @Override
    public void execute(String[] args) throws Exception {
        ArrayDeque<Flat> flats = CollectionManager.getArrayDeque();
        if (flats.isEmpty()){
            System.out.println("No flats :(");
        } else{
            for (Flat flat : flats) {
                System.out.println(flat);
            }
        }
    }

    @Override
    public String getName() {
        return "show";
    }

    @Override
    public String getDescription() {
        return "вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }
}
