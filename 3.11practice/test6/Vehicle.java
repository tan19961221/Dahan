class Vehicle {

    int wheels;
    double weight;
    Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }
    void print1() {
        System.out.println("Vehicle 车轮：" +wheels +
                "; 车重：" +weight);
    }

}

class Car extends Vehicle {
    int loader;
    Car(int loader, int wheels, double weight) {
        super(wheels, weight);
        this.loader = loader;
    }
    void print2() {
        System.out.println("Car 车轮：" +wheels +
                "; 车重：" +weight + "; 人数：" + loader);
    }
}

class Truck extends Car {
    double payload;
    Truck(double payload, int loader, int wheels, double weight) {
        super(loader, wheels, weight);
        this.payload = payload;
        this.loader = loader;
    }
    void print3() {
        System.out.println("Truck 车轮：" +wheels + "; 车重：" +
                weight + "; 人数：" +loader + "; 有载重量:" + payload);}
}

class Test {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(4, 100.0);
        v.print1();
        Car c = new Car(4, 4, 40);
        c.print2();
        Truck t = new Truck(1000, 8, 8, 160);
        t.print3();
    }
}
