import java.util.ArrayList;
import java.util.List;

public class AVG {
    public static void main(String[] args){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Ford",10,223));
        cars.add(new Car("Hyundai",4,210));
        cars.add(new Car("Jeep",2,267));
        cars.add(new Car("Lada",12,200));
        
        double Average = Averages(cars);
        System.out.println("Средний возраст: " + Average);
        System.out.println(cars);
    }
    public static double Averages(List<Car> cars){
        if (cars.isEmpty()){
            return 0;
        }
        
        double total = 0;
        for (Car car : cars){
            total += car.getAge();
        }
        return (double) total / cars.size();
    }
}
class Car {
    private String NameCar;
    private int Age;
    private int Speed;
    public Car(String NameCar, int Age, int Speed){
        this.NameCar = NameCar;
        this.Age = Age;
        this.Speed = Speed;
    }
    public int getAge(){
        return Age;
    }

}
