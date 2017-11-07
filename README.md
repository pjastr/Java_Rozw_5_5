5. W nowym projekcie wykonaj czynności:
* W klasie `Car` dodaj pola `year` (rok produkcji) i `brand` (marka) oraz konstruktor z parametrami (`year`, `brand`).
* W klasie `Main` stwórz kolekcje `cars` i dodaj na nią kilka samochodów za pomocą konstruktora
np.:
```java
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(2010, "Ford"));
        cars.add(new Car(2016, "Fiat"));
        cars.add(new Car(2012, "Skoda"));
        cars.add(new Car(2010, "BMW"));
```
(dodaj brakujące biblioteki)
* Do klasy `Car` dodaj interfejs `Comparable<T>` i metodę `CompareTo`. Następnie posortuj elementy na
liście i wyświetl je kolejno na konsoli. Na koniec zmień kolejność sortowania.
