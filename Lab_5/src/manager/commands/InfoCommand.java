package manager.commands;

import manager.CollectionManager;
/**
 *  Данная команда выводит различную информацию про коллекцию и ее содержимое
 *
 * @author Kemansu
 * @since 1.0
 */
public class InfoCommand implements Command{
    @Override
    public void execute(String[] args) throws Exception {
        System.out.println("Type - " + CollectionManager.getArrayDeque().getClass().getName());
        System.out.println("Count of Flats - " + CollectionManager.getArrayDeque().size());
        System.out.println("Init date - " + CollectionManager.getInitDate());
    }

    @Override
    public String getName() {
        return "info";
    }

    @Override
    public String getDescription() {
        return "вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)";
    }
}
