import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {


    public static void main(String[] args) {

        System.out.println();
        Calendar calendar1 = new GregorianCalendar(2015, Calendar.JANUARY, 1);// ввести дату релиза

        Date dayOfRelease1 = calendar1.getTime();

        Bike myBike = new MountainBike("red", "Alexey", Brand.RIZER, 28, true, 27, dayOfRelease1);

        SimpleDateFormat formattedCalendar1 = new SimpleDateFormat();
        formattedCalendar1.applyPattern("dd.MM.yyyy");
        System.out.println("День релиза myBike - " + formattedCalendar1.format(dayOfRelease1));
        System.out.println(myBike.toString());
        System.out.println();

        myBike.methodOfDriving();
        myBike.move();
        System.out.println();

        myBike.stopMoving(1);

        Movable myBikeMovable = new MountainBike();
        myBikeMovable.move();
        System.out.println();

        System.out.println();
        Calendar calendar2 = new GregorianCalendar(2016, Calendar.FEBRUARY, 14);// ввести дату релиза
        Date dayOfRelease2 = calendar2.getTime();

        Bike herBike = new CityBike("green", "Alena", Brand.AIST, 28, true, 30, dayOfRelease2);

        SimpleDateFormat formattedCalendar2 = new SimpleDateFormat();
        formattedCalendar1.applyPattern("dd.MM.yyyy");
        System.out.println("День релиза herBike - " + formattedCalendar2.format(dayOfRelease2));
        System.out.println(herBike.toString());

        herBike.methodOfDriving();
        herBike.move();
        System.out.println();

        herBike.stopMoving(3);

        Movable herBikeMovable = new CityBike();
        herBikeMovable.move();
        System.out.println();

        HybridBike hybridBike = new HybridBike();

        Movable bike3Move = new HybridBike();
        bike3Move.move();
        System.out.println(bike3Move.toString());

        hybridBike.setWeighOfBike(22);
        hybridBike.setMaterialOfFrame("Aluminum");
        System.out.println(hybridBike.toString());

        RoadBike roadBike = new RoadBike();

        Movable bike4Move = new RoadBike();
        bike4Move.move();
        System.out.println(bike4Move.toString());

        roadBike.setWeighOfBike(11);
        roadBike.setMaterialOfFrame("Carbon");
        System.out.println(roadBike.toString());
    }
}
