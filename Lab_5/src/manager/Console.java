package manager;

import data.generators.IdGenerator;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Данный класс отвечает за чтение командной строки
 * Обеспечивает связь между пользователем и командами
 *
 * @author Kemansu
 * @since 1.0
 */
public class Console {
    public void start(InputStream input) throws ParserConfigurationException, IOException, SAXException {
        Scanner scanner = new Scanner(input);
        CollectionManager collectionManager = new CollectionManager();
        IdGenerator idGenerator = new IdGenerator();
        ReaderXML.read();
        IdGenerator.Fuel();


        while (scanner.hasNextLine()){
            String command = scanner.nextLine();
            CommandManager commandManager = new CommandManager();
            try {
                commandManager.startExecuting(command);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

