package manager;

import exceptions.UnknownCommandException;
import manager.commands.*;

import java.util.LinkedHashMap;

public class CommandManager {
    private static LinkedHashMap<String, Command> commandList;

    public CommandManager(){
        commandList = new LinkedHashMap<>();
        commandList.put("help", new HelpCommand());
        commandList.put("add", new AddCommand());
        commandList.put("info", new InfoCommand());
        commandList.put("show", new ShowCommand());
        commandList.put("update", new UpdateCommand());
        commandList.put("remove_by_id", new RemoveCommand());
        commandList.put("clear", new ClearCommand());
        commandList.put("exit", new ExitCommand());
        commandList.put("add_if_min", new AddIfMinCommand());
        commandList.put("remove_greater", new RemoveGreaterCommand());
        commandList.put("remove_lower", new RemoveLowerCommand());
        commandList.put("group_counting_by_kitchen_area", new GroupCountingByKitchenArea());
        commandList.put("count_greater_than_house", new GreaterThanHouse());
        commandList.put("print_field_ascending_transport", new PrintSortedTransport());
        commandList.put("execute_script_command", new ExecuteScriptCommand());
        commandList.put("save", new SaveCommand());
    }

    public static void startExecuting(String line) throws Exception {
        String commandName = line.split(" ")[0];
        if (!commandList.containsKey(commandName)) {
            throw new UnknownCommandException(commandName);
        }
        Command command = commandList.get(commandName);
        command.execute(line.split(" "));
    }

    public static LinkedHashMap<String, Command> getCommandList() {
        return commandList;
    }


}
