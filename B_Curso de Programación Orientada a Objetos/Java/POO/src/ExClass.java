public class ExClass {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car car = new Car();
        car.license = "AMO123";
        car.driver = "Andres Enriquez";
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "QWE567";
        car2.driver = "Paola Sanchez";
        car2.passenger = 3;
        car2.printDataCar();

    }
    static class Car {
        String license;
        String driver;
        Integer passenger;
        void printDataCar(){
            System.out.println("License: " + license + " Driver " + driver);
        }
    }
}
