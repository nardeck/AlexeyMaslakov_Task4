import java.util.Objects;

public class Bike4 implements Movable {

    public final String TIPEOFBIKE = "Road";
    StringBuilder stringBuilder = new StringBuilder("Bike4{TIPEOFBIKE='");
    private String materialOfFrame;
    private double weighOfBike;

    public Bike4() {
    }

    public Bike4(double weighOfBike) {
        this.weighOfBike = weighOfBike;
    }

    public String getMaterialOfFrame() {
        return materialOfFrame;
    }

    public void setMaterialOfFrame(String materialOfFrame) {
        this.materialOfFrame = materialOfFrame;
    }

    public void setWeighOfBike(double weighOfBike) {
        this.weighOfBike = weighOfBike;
    }

    @Override
    public void move() {
        System.out.println("I can only move on this bike on the road");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike4 bike4 = (Bike4) o;
        return Double.compare(bike4.weighOfBike, weighOfBike) == 0 && Objects.equals(materialOfFrame, bike4.materialOfFrame);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TIPEOFBIKE, materialOfFrame, weighOfBike);
    }


    @Override
    public String toString() {
        stringBuilder.append(TIPEOFBIKE).append(", materialOfFrame='").append(materialOfFrame).append(", weighOfBike=").append(weighOfBike).append('}');
        System.out.println(stringBuilder);
        return "";
    }
}

