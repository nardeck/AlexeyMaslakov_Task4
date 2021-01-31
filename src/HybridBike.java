import java.util.Objects;

public class HybridBike implements Movable {

    public final String TIPEOFBIKE = "Mountain-Road";

    private String materialOfFrame;
    private double weighOfBike;

    public HybridBike() {
    }

    @Override
    public void move() {
        System.out.println("I can move up the mountains and down the road.");
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
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder("Bike3{TIPEOFBIKE='");
        stringBuilder.append(TIPEOFBIKE).append(", materialOfFrame='").append(materialOfFrame).append(", weighOfBike=").append(weighOfBike).append('}');
        System.out.println(stringBuilder);
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HybridBike hybridBike = (HybridBike) o;
        return Double.compare(hybridBike.weighOfBike, weighOfBike) == 0 && Objects.equals(materialOfFrame, hybridBike.materialOfFrame);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TIPEOFBIKE, materialOfFrame, weighOfBike);
    }

}
