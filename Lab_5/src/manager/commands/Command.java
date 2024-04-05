package manager.commands;

/**
 *  Базовый интерфейс для реализации команд. Такие команды содержаться в CollectionManager
 *
 * @author Kemansu
 * @since 1.0
 */

public interface Command {
    public void execute(String[] args) throws Exception;

    public String getName();

    public String getDescription();
}
