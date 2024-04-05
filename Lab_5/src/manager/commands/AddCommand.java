package manager.commands;

import data.Flat;
import data.generators.FlatGenerator;
import data.generators.IdGenerator;
import manager.CollectionManager;
import manager.CommandManager;
import manager.WritterXML;
/**
 * Данная команда добавляет новый элемент в коллекцию
 *
 * @author Kemansu
 * @since 1.0
 */
public class AddCommand implements Command{
    @Override
    public void execute(String[] args) throws Exception {
        System.out.println("Let's make a flat!\n");
        Flat flat = FlatGenerator.createFlat(IdGenerator.getId());
        CollectionManager.add(flat);

        System.out.println("Congrats!\n");
        System.out.println("Flat added!");
    }

    @Override
    public String getName() {
        return "add";
    }

    @Override
    public String getDescription() {
        return "добавить новый элемент в коллекцию";
    }
}
