import java.util.Date;
import java.util.Objects;

public abstract class Bike implements Movable {


    protected String color;
    protected String nameOfTheOwner;
    protected Brand brand;
    protected int numberOfSpeeds;
    protected boolean moving;
    protected Date dayOfRelease;

    StringBuilder stringBuilder = new StringBuilder("Bike{");


    public Bike() {
    }


    public Bike(String color, String nameOfTheOwner, Brand brand, int numberOfSpeeds, boolean moving, Date dayOfRelease) {

        this.color = color;
        this.nameOfTheOwner = nameOfTheOwner;
        this.brand = brand;
        this.numberOfSpeeds = numberOfSpeeds;
        this.moving = moving;
        this.dayOfRelease = dayOfRelease;

    }

    abstract void methodOfDriving();

    void stopMoving(int i) {
        switch (i) {
            case 1 -> System.out.println("Bike тормозит задним колесом");
            case 2 -> System.out.println("Bike тормозит передним колесом");
            case 3 -> System.out.println("Bike тормозит обоими колесами");
            default -> System.out.println("Выбирите один из один из трех вариантов : 1,2 или 3");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return numberOfSpeeds == bike.numberOfSpeeds && moving == bike.moving && Objects.equals(color, bike.color) && Objects.equals(nameOfTheOwner, bike.nameOfTheOwner) && brand == bike.brand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, nameOfTheOwner, brand, numberOfSpeeds, moving);
    }

    @Override
    public String toString() {
        stringBuilder.append("color='").append(color).append('\'').append(", nameOfTheOwner='").append(nameOfTheOwner).append('\'').append(", brand=").append(brand).append(", numberOfSpeeds=").append(numberOfSpeeds).append(", moving=").append(moving).append(", dayOfRelease=").append(dayOfRelease).append('}');
        System.out.println(stringBuilder);
        return "";


    }
}



