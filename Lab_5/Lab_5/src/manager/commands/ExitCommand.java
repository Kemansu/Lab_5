package manager.commands;

public class ExitCommand implements Command{
    @Override
    public void execute(String[] args) throws Exception {
        System.exit(1);
    }

    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public String getDescription() {
        return "завершить программу (без сохранения в файл)";
    }
}
