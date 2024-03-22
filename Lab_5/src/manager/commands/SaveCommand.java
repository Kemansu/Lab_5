package manager.commands;

import manager.WritterXML;

public class SaveCommand implements Command{
    @Override
    public void execute(String[] args) throws Exception {
        WritterXML.write();
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
