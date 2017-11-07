public class Car implements Comparable<Car>{
    String brand;
    int year;

    public Car(int year, String brand)
    {
        this.brand=brand;
        this.year=year;
    }

    public int compareTo(Car o) {
        return o.brand.compareTo(this.brand);
    }

    public String Info()
    {
        return brand+" "+year;
    }
}
