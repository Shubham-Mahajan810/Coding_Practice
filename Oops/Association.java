// Engine class representing the car engine
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Car class representing a car
class Car {
    private String model;
    private Engine engine;

    // Association example
    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    // Aggregation example
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    // Composition example
    public Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType);
    }
}

public class Association {
    public static void main(String[] args) {
        // Association example
        Engine engine1 = new Engine("V6");
        Car car1 = new Car("Toyota Camry", engine1);

        // Aggregation example
        Engine engine2 = new Engine("V8");
        Car car2 = new Car("Ford Mustang", engine2);

        // Composition example
        Car car3 = new Car("Tesla Model S", "Electric");

        // Accessing information
        System.out.println("Car model: " + car1.getModel() + ", Engine type: " + car1.getEngine().getType());
        System.out.println("Car model: " + car2.getModel() + ", Engine type: " + car2.getEngine().getType());
        System.out.println("Car model: " + car3.getModel() + ", Engine type: " + car3.getEngine().getType());
    }
}

