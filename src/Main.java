import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {


    public static void main(String[] args) {


        System.out.println();
        Calendar calendar1 = new GregorianCalendar(2015, Calendar.JANUARY, 1);// ввести дату релиза

        Date dayOfRelease1 = calendar1.getTime();

        Bike myBike = new Bike1("red", "Alexey", Brand.RIZER, 27, true, 27, dayOfRelease1);

        SimpleDateFormat formattedCalendar1 = new SimpleDateFormat();
        formattedCalendar1.applyPattern("dd.MM.yyyy");
        System.out.println("День релиза myBike - " + formattedCalendar1.format(dayOfRelease1));
        System.out.println(myBike.toString());
        System.out.println();

        myBike.methodOfDriving();
        myBike.move();
        System.out.println();

        myBike.stopMoving(1);

        Movable myBikeMovable = new Bike1();
        myBikeMovable.move();
        System.out.println();

        System.out.println();
        Calendar calendar2 = new GregorianCalendar(2016, Calendar.FEBRUARY, 14);// ввести дату релиза
        Date dayOfRelease2 = calendar2.getTime();

        Bike herBike = new Bike2("green", "Alena", Brand.AIST, 1, true, 30, dayOfRelease2);

        SimpleDateFormat formattedCalendar2 = new SimpleDateFormat();
        formattedCalendar1.applyPattern("dd.MM.yyyy");
        System.out.println("День релиза herBike - " + formattedCalendar2.format(dayOfRelease2));
        System.out.println(herBike.toString());

        herBike.methodOfDriving();
        herBike.move();
        System.out.println();

        herBike.stopMoving(3);

        Movable herBikeMovable = new Bike2();
        herBikeMovable.move();
        System.out.println();

        Bike3 bike3 = new Bike3();

        Movable bike3Move = new Bike3();
        bike3Move.move();
        System.out.println(bike3Move.toString());

        bike3.setWeighOfBike(22);
        bike3.setMaterialOfFrame("Aluminum");
        System.out.println(bike3.toString());

        Bike4 bike4 = new Bike4();

        Movable bike4Move = new Bike4();
        bike4Move.move();
        System.out.println(bike4Move.toString());

        bike4.setWeighOfBike(11);
        bike4.setMaterialOfFrame("Carbon");
        System.out.println(bike4.toString());
    }
}
