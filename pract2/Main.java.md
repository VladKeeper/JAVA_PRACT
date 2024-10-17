```
public class Main {
    public static void main(String[] args){
        Car car1 = new Car("Koenigsegg","AB00BA","white",2019);
        Car car2 = new Car("KIA",2015);
        Car car3 = new Car();
        System.out.println(car1.toString());
        System.out.println(car2);
        System.out.println(car3);
        car3.setYear(1989);
        System.out.print("Updated year for car3: "+ car3.getAge() );
    }
}
```
