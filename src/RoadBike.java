import java.util.Objects;

public class RoadBike implements Movable {

    public final String TIPEOFBIKE = "Road";

    private String materialOfFrame;
    private double weighOfBike;

    public RoadBike() {
    }

    public RoadBike(double weighOfBike) {
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
        RoadBike roadBike = (RoadBike) o;
        return Double.compare(roadBike.weighOfBike, weighOfBike) == 0 && Objects.equals(materialOfFrame, roadBike.materialOfFrame);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TIPEOFBIKE, materialOfFrame, weighOfBike);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder("Bike4{TIPEOFBIKE='");
        stringBuilder.append(TIPEOFBIKE).append(", materialOfFrame='").append(materialOfFrame).append(", weighOfBike=").append(weighOfBike).append('}');
        System.out.println(stringBuilder);
        return "";
    }
}

