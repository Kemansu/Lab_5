package manager.commands;

import manager.CommandManager;

import java.util.LinkedHashMap;

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
