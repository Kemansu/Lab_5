package manager.commands;

import manager.CommandManager;

import java.util.LinkedHashMap;
/**
 *  Данная команда выводит информацию про команды, которые можно использовать в консольномо приложении
 *
 * @author Kemansu
 * @since 1.0
 */
public class HelpCommand implements Command{
    @Override
    public void execute(String[] args) throws Exception {
        CommandManager commandManager = new CommandManager();
        LinkedHashMap<String, Command> commandList = commandManager.getCommandList();
        for (String name: commandList.keySet()){
            Command command = commandList.get(name);
            System.out.println(command.getName() + " - " + command.getDescription());
        }
    }

    @Override
    public String getName() {
        return "help";
    }

    @Override
    public String getDescription() {
        return "вывести справку по доступным командам";
    }
}
