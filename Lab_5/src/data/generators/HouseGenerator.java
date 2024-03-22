package data.generators;

import data.House;

import java.util.Scanner;

public class HouseGenerator {
    public static House createHouse(){
        String input = null;
        Scanner scanner = new Scanner(System.in);

        House house = new House();

        while (true) {
            System.out.println("Input name of House (String):");
            try {
                input = scanner.nextLine();
                house.setName(input);
                break;
            } catch (Exception e){
                System.out.println("Wrong input: " + input);
            }
        }


        while (true) {
            System.out.println("Input year of House (Long):");
            try {
                input = scanner.nextLine();
                house.setYear(Long.valueOf(input));
                break;
            } catch (Exception e){
                System.out.println("Wrong input: " + input);
            }
        }

        while (true) {
            System.out.println("Input number Of Flats On Floor (Integer):");
            try {
                input = scanner.nextLine();
                house.setNumberOfFlatsOnFloor(Integer.valueOf(input));
                break;
            } catch (Exception e){
                System.out.println("Wrong input: " + input);
            }
        }


        return house;
    }
}
