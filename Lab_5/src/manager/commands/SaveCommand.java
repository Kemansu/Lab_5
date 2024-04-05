package manager.commands;

import manager.WritterXML;
/**
 *  Данная команда сохраняет коллекицю в файл, в формате xml
 *
 * @author Kemansu
 * @since 1.0
 */
public class SaveCommand implements Command{
    @Override
    public void execute(String[] args) throws Exception {
        WritterXML.write();
    }

    @Override
    public String getName() {
        return "save";
    }

    @Override
    public String getDescription() {
        return "сохранить коллекцию в файл";
    }
}
