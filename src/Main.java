import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(2010, "Ford"));
        cars.add(new Car(2016, "Fiat"));
        cars.add(new Car(2012, "Skoda"));
        cars.add(new Car(2010, "BMW"));
        Collections.sort(cars);
        for (Car element:cars) {
            System.out.println(element.Info());
        }
    }
}
