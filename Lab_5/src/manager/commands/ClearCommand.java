package manager.commands;

import manager.CollectionManager;
import manager.WritterXML;
/**
 *  Данная команда очищает коллекцию
 *
 * @author Kemansu
 * @since 1.0
 */
public class ClearCommand implements Command{
    @Override
    public void execute(String[] args) throws Exception {
        CollectionManager.clear();
        System.out.println("Collection successfully cleared!");
    }

    @Override
    public String getName() {
        return "clear";
    }

    @Override
    public String getDescription() {
        return "очистить коллекцию";
    }
}
