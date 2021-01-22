import java.util.Objects;

public class Bike3 implements Movable {

    public final String TIPEOFBIKE = "Mountain";
    StringBuilder stringBuilder = new StringBuilder("Bike3{TIPEOFBIKE='");
    private String materialOfFrame;
    private double weighOfBike;

    public Bike3() {
    }

    @Override
    public void move() {
        System.out.println("I can only move on this bike on the mountain");
    }

    public String getMaterialOfFrame() {
        return materialOfFrame;
    }

    public void setMaterialOfFrame(String materialOfFrame) {
        this.materialOfFrame = materialOfFrame;
    }

    public double getWeighOfBike() {
        return weighOfBike;
    }

    public void setWeighOfBike(double weighOfBike) {
        this.weighOfBike = weighOfBike;
    }

    @Override
    public String toString() {
        stringBuilder.append(TIPEOFBIKE).append(", materialOfFrame='").append(materialOfFrame).append(", weighOfBike=").append(weighOfBike).append('}');
        System.out.println(stringBuilder);
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike3 bike3 = (Bike3) o;
        return Double.compare(bike3.weighOfBike, weighOfBike) == 0 && Objects.equals(materialOfFrame, bike3.materialOfFrame);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TIPEOFBIKE, materialOfFrame, weighOfBike);
    }

}
