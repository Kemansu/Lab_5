package data;
/**
 * модель объекта "дом"
 * содержит геттеры/сеттеры
 *
 * @author Kemansu
 * @since 1.0
 */
public class House {
    private String name; //Поле может быть null
    private Long year; //Значение поля должно быть больше 0
    private Integer numberOfFlatsOnFloor; //Значение поля должно быть больше 0

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public void setNumberOfFlatsOnFloor(Integer numberOfFlatsOnFloor) {
        this.numberOfFlatsOnFloor = numberOfFlatsOnFloor;
    }

    public String getName() {
        return name;
    }

    public Long getYear() {
        return year;
    }

    public Integer getNumberOfFlatsOnFloor() {
        return numberOfFlatsOnFloor;
    }

    @Override
    public String toString() {
        return name;
    }
}
