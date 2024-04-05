package manager.commands;

import manager.CollectionManager;
import manager.WritterXML;

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
