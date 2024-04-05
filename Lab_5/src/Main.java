import manager.Console;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Данный класс запускает работу консольного приложения
 *
 * @author Kemansu
 * @since 1.0
 */
public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        Console console = new Console();
        console.start(System.in);
    }
}