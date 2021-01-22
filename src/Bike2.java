import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Bike2 extends Bike implements Movable {

    protected double speed;
    protected double diameterOfWheels;

    public Bike2() {
    }

    public Bike2(String color, String nameOfTheOwner, Brand brand, int numberOfSpeeds, boolean moving, double diameterOfWheels, Date dateOfRelease) {
        super(color, nameOfTheOwner, brand, numberOfSpeeds, moving,dateOfRelease);
        this.diameterOfWheels = diameterOfWheels;
    }

    void methodOfDriving() {
        System.out.println(numberOfSpeeds <= 11 ? "Sitting position" : "Standing position");
    }

    public void move() {
        System.out.println(numberOfSpeeds > 1 ? "I can move on this Bike2" : "I stopped the Bike2");
    }

    void stopMoving(int i) {
        if (i == 1) {
            System.out.println("Bike2 тормозит задним колесом");
        } else if (i == 2) {
            System.out.println("Bike2 тормозит передним колесом");
        } else if (i == 3) {
            System.out.println("Bike2 тормозит обоими колесами");
        } else System.out.println("Выбирите один из один из трех вариантов : 1,2 или 3");
    }

    void speedBike(double wayOfTime) {
        double way = wayOfTime * speed;
        speed = numberOfSpeeds * 2.3;
        System.out.println("средняя скорость Bike2 на данной передаче равна -  " + speed + "км/ч");
        System.out.println("пройденный путь Bike2 за указанное время равен - " + way + "км");
    }

    public void greaseAchain() {
        System.out.println("цепь смазана");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bike2 bike2 = (Bike2) o;
        return Double.compare(bike2.speed, speed) == 0 && Double.compare(bike2.diameterOfWheels, diameterOfWheels) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, diameterOfWheels);
    }

    StringBuilder stringBuilder = new StringBuilder("Bike2{");

    @Override
    public String toString() {
        stringBuilder.append("color='").append(color).append('\'').append(", nameOfTheOwner='").append(nameOfTheOwner).append('\'').append(", numberOfSpeeds=").append(numberOfSpeeds).append(", moving=").append(moving).append(", speed=").append(speed).append(", diameterOfWheels=").append(diameterOfWheels).append('}');
        System.out.println(stringBuilder);
        return "";
    }
}