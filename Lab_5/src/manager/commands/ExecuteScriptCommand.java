package manager.commands;


import data.*;
import data.comparators.FlatsComparator;
import data.generators.FlatGenerator;
import data.generators.IdGenerator;
import exceptions.WrongInputException;
import manager.CollectionManager;
import manager.CommandManager;

import java.io.FileReader;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Scanner;

public class ExecuteScriptCommand implements Command{
    @Override
    public void execute(String[] args) throws Exception {
        String filePath = args[1];
        Scanner scanner = new Scanner(new FileReader(filePath));

        try {
            while (scanner.hasNextLine()) {
                String command = scanner.nextLine();

                if (command.equals("add")) {
                    String name = scanner.nextLine();
                    Double coordinateX = Double.valueOf(scanner.nextLine());
                    Long coordinateY = Long.valueOf(scanner.nextLine());
                    Coordinates coordinates = new Coordinates(coordinateX, coordinateY);
                    Long area = Long.valueOf(scanner.nextLine());
                    Long numberOfRooms = Long.valueOf(scanner.nextLine());
                    Double kitchenArea = Double.valueOf(scanner.nextLine());
                    View view = View.valueOf(scanner.nextLine());
                    Transport transport = Transport.valueOf(scanner.nextLine());

                    House house = new House();

                    String nameHouse = scanner.nextLine();
                    Long yearHouse = Long.valueOf(scanner.nextLine());
                    Integer numberOfFlatsOnFloorHouse = Integer.valueOf(scanner.nextLine());

                    house.setName(nameHouse);
                    house.setYear(yearHouse);
                    house.setNumberOfFlatsOnFloor(numberOfFlatsOnFloorHouse);

                    Flat flat = new Flat(IdGenerator.getId());
                    flat.setName(name);
                    flat.setCoordinates(coordinates);
                    flat.setArea(area);
                    flat.setNumberOfRooms(numberOfRooms);
                    flat.setKitchenArea(kitchenArea);
                    flat.setView(view);
                    flat.setTransport(transport);
                    flat.setHouse(house);

                    CollectionManager.add(flat);
                } else if (command.equals("update")) {
                    Long neededId = Long.valueOf(scanner.nextLine());
                    Object[] array = CollectionManager.getArrayDeque().toArray();
                    String name = scanner.nextLine();
                    Double coordinateX = Double.valueOf(scanner.nextLine());
                    Long coordinateY = Long.valueOf(scanner.nextLine());
                    Coordinates coordinates = new Coordinates(coordinateX, coordinateY);
                    Long area = Long.valueOf(scanner.nextLine());
                    Long numberOfRooms = Long.valueOf(scanner.nextLine());
                    Double kitchenArea = Double.valueOf(scanner.nextLine());
                    View view = View.valueOf(scanner.nextLine());
                    Transport transport = Transport.valueOf(scanner.nextLine());

                    House house = new House();

                    String nameHouse = scanner.nextLine();
                    Long yearHouse = Long.valueOf(scanner.nextLine());
                    Integer numberOfFlatsOnFloorHouse = Integer.valueOf(scanner.nextLine());

                    house.setName(nameHouse);
                    house.setYear(yearHouse);
                    house.setNumberOfFlatsOnFloor(numberOfFlatsOnFloorHouse);

                    Flat newflat = new Flat(IdGenerator.getId());
                    newflat.setName(name);
                    newflat.setCoordinates(coordinates);
                    newflat.setArea(area);
                    newflat.setNumberOfRooms(numberOfRooms);
                    newflat.setKitchenArea(kitchenArea);
                    newflat.setView(view);
                    newflat.setTransport(transport);
                    newflat.setHouse(house);

                    array[(int) (neededId - 1)] = newflat;

                    ArrayDeque<Flat> updatedArraydeque = new ArrayDeque<>();

                    for (Object flat : array) {
                        updatedArraydeque.add((Flat) flat);
                    }
                    CollectionManager.setArrayDeque(updatedArraydeque);
                    System.out.println("Flat successfully update!");

                } else if (command.equals("add_if_min")) {
                    // Преобразуем коллекцию в лист
                    List<Flat> arrayDeque_list = CollectionManager.getArrayDeque().stream().toList();

                    // Проверка на минимум (через сортировку)
                    FlatsComparator c = new FlatsComparator();
                    Flat min_flat = arrayDeque_list.stream().min(c).get();

                    String name = scanner.nextLine();
                    Double coordinateX = Double.valueOf(scanner.nextLine());
                    Long coordinateY = Long.valueOf(scanner.nextLine());
                    Coordinates coordinates = new Coordinates(coordinateX, coordinateY);
                    Long area = Long.valueOf(scanner.nextLine());
                    Long numberOfRooms = Long.valueOf(scanner.nextLine());
                    Double kitchenArea = Double.valueOf(scanner.nextLine());
                    View view = View.valueOf(scanner.nextLine());
                    Transport transport = Transport.valueOf(scanner.nextLine());

                    House house = new House();

                    String nameHouse = scanner.nextLine();
                    Long yearHouse = Long.valueOf(scanner.nextLine());
                    Integer numberOfFlatsOnFloorHouse = Integer.valueOf(scanner.nextLine());

                    house.setName(nameHouse);
                    house.setYear(yearHouse);
                    house.setNumberOfFlatsOnFloor(numberOfFlatsOnFloorHouse);

                    Flat flat = new Flat(0L);
                    flat.setName(name);
                    flat.setCoordinates(coordinates);
                    flat.setArea(area);
                    flat.setNumberOfRooms(numberOfRooms);
                    flat.setKitchenArea(kitchenArea);
                    flat.setView(view);
                    flat.setTransport(transport);
                    flat.setHouse(house);

                    if (c.compare(flat, min_flat) < 0) {
                        flat.setId(IdGenerator.getId());
                        CollectionManager.add(flat);
                        System.out.println("Flat successfully added!");
                    } else {
                        System.out.println("Flat did not suit :(");
                    }

                } else if (command.equals("remove_greater")) {
                    FlatsComparator c = new FlatsComparator();
                    Object[] array = CollectionManager.getArrayDeque().toArray();
                    ArrayDeque<Flat> arrayDeque_new = new ArrayDeque<>();
                    Integer k = 0;

                    // Заданный параметр
                    // flat_param

                    String name = scanner.nextLine();
                    Double coordinateX = Double.valueOf(scanner.nextLine());
                    Long coordinateY = Long.valueOf(scanner.nextLine());
                    Coordinates coordinates = new Coordinates(coordinateX, coordinateY);
                    Long area = Long.valueOf(scanner.nextLine());
                    Long numberOfRooms = Long.valueOf(scanner.nextLine());
                    Double kitchenArea = Double.valueOf(scanner.nextLine());
                    View view = View.valueOf(scanner.nextLine());
                    Transport transport = Transport.valueOf(scanner.nextLine());

                    House house = new House();

                    String nameHouse = scanner.nextLine();
                    Long yearHouse = Long.valueOf(scanner.nextLine());
                    Integer numberOfFlatsOnFloorHouse = Integer.valueOf(scanner.nextLine());

                    house.setName(nameHouse);
                    house.setYear(yearHouse);
                    house.setNumberOfFlatsOnFloor(numberOfFlatsOnFloorHouse);

                    Flat flat_param = new Flat(0L);
                    flat_param.setName(name);
                    flat_param.setCoordinates(coordinates);
                    flat_param.setArea(area);
                    flat_param.setNumberOfRooms(numberOfRooms);
                    flat_param.setKitchenArea(kitchenArea);
                    flat_param.setView(view);
                    flat_param.setTransport(transport);
                    flat_param.setHouse(house);

                    for (Object object : array) {
                        Flat flat = (Flat) object;
                        if (c.compare(flat, flat_param) <= 0) {
                            arrayDeque_new.add(flat);
                        } else {
                            k++;
                        }
                    }

                    CollectionManager.setArrayDeque(arrayDeque_new);
                    System.out.println("Collection was successfully changed!\nFlats deleted - " + k);

                } else if (command.equals("remove_lower")) {

                    FlatsComparator c = new FlatsComparator();
                    Object[] array = CollectionManager.getArrayDeque().toArray();
                    ArrayDeque<Flat> arrayDeque_new = new ArrayDeque<>();
                    Integer k = 0;

                    // Заданный параметр
                    String name = scanner.nextLine();
                    Double coordinateX = Double.valueOf(scanner.nextLine());
                    Long coordinateY = Long.valueOf(scanner.nextLine());
                    Coordinates coordinates = new Coordinates(coordinateX, coordinateY);
                    Long area = Long.valueOf(scanner.nextLine());
                    Long numberOfRooms = Long.valueOf(scanner.nextLine());
                    Double kitchenArea = Double.valueOf(scanner.nextLine());
                    View view = View.valueOf(scanner.nextLine());
                    Transport transport = Transport.valueOf(scanner.nextLine());

                    House house = new House();

                    String nameHouse = scanner.nextLine();
                    Long yearHouse = Long.valueOf(scanner.nextLine());
                    Integer numberOfFlatsOnFloorHouse = Integer.valueOf(scanner.nextLine());

                    house.setName(nameHouse);
                    house.setYear(yearHouse);
                    house.setNumberOfFlatsOnFloor(numberOfFlatsOnFloorHouse);

                    Flat flat_param = new Flat(0L);
                    flat_param.setName(name);
                    flat_param.setCoordinates(coordinates);
                    flat_param.setArea(area);
                    flat_param.setNumberOfRooms(numberOfRooms);
                    flat_param.setKitchenArea(kitchenArea);
                    flat_param.setView(view);
                    flat_param.setTransport(transport);
                    flat_param.setHouse(house);

                    for (Object object : array) {
                        Flat flat = (Flat) object;
                        if (c.compare(flat, flat_param) >= 0) {
                            arrayDeque_new.add(flat);
                        } else {
                            k++;
                        }
                    }

                    CollectionManager.setArrayDeque(arrayDeque_new);
                    System.out.println("Collection was successfully changed!\nFlats deleted - " + k);
                } else if (command.equals("execute_script_command " + filePath)) {
                    throw new WrongInputException();
                }
                if (CommandManager.getCommandList().containsKey(command)) {
                    CommandManager.startExecuting(command);
                }
            }
        } catch (Exception e) {
            System.out.println("Wrong input data");
        }
    }

    @Override
    public String getName() {
        return "execute_script_command";
    }

    @Override
    public String getDescription() {
        return "считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме ";
    }
}
