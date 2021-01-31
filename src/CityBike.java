import java.util.Date;
import java.util.Objects;

public class CityBike extends Bike implements Movable {

    protected double speed;
    protected double diameterOfWheels;

    public CityBike() {
    }

    public CityBike(String color, String nameOfTheOwner, Brand brand, int numberOfSpeeds, boolean moving, double diameterOfWheels, Date dateOfRelease) {
        super(color, nameOfTheOwner, brand, numberOfSpeeds, moving, dateOfRelease);
        this.diameterOfWheels = diameterOfWheels;
    }

    void methodOfDriving() {
        if (numberOfSpeeds > 21) {
            System.out.println("для данного байка количество передач не должно превышать 21");
        }
        if (numberOfSpeeds < 0) {
            System.out.println("номер передачи не может быть отрицательным");
        }
        System.out.println(numberOfSpeeds <= 11 ? "Sitting position" : "Standing position");
    }

    public void move() {
        if (numberOfSpeeds > 21) {
            System.out.println("для данного байка количество передач не должно превышать 21");
        }
        if (numberOfSpeeds < 0) {
            System.out.println("номер передачи не может быть отрицательным");
        }
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
        if (numberOfSpeeds > 21) {
            System.out.println("для данного байка количество передач не должно превышать 21");
        }
        if (numberOfSpeeds < 0) {
            System.out.println("номер передачи не может быть отрицательным");
        }
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
        CityBike cityBike = (CityBike) o;
        return Double.compare(cityBike.speed, speed) == 0 && Double.compare(cityBike.diameterOfWheels, diameterOfWheels) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, diameterOfWheels);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder("Bike2{");
        stringBuilder.append("color='").append(color).append('\'').append(", nameOfTheOwner='").append(nameOfTheOwner).append('\'').append(", numberOfSpeeds=").append(numberOfSpeeds).append(", moving=").append(moving).append(", speed=").append(speed).append(", diameterOfWheels=").append(diameterOfWheels).append('}');
        System.out.println(stringBuilder);
        return "";
    }
}