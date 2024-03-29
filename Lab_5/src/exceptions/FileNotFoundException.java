package exceptions;

public class FileNotFoundException extends Exception{
    public FileNotFoundException(){
        System.out.println("file not found");
    }
}
