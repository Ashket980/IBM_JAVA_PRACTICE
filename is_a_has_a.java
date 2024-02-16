public class RelationshipsDemo {

    public static void main(String[] args) {
        // **Is-A Relationship:** Dog extends Animal (subclass inherits from superclass)
        Animal dog = new Dog("Fido");
        dog.makeSound(); // Outputs "Woof!"

        // **Has-A Relationship:** Car has an Engine
        Engine engine = new Engine("V8 Turbo");
        Car car = new Car(engine, "Ferrari", "Red");
        car.startEngine(); // Outputs "V8 Turbo engine started!"
        car.accelerate(); // Outputs "Ferrari is accelerating!"

        // **Uses-A Relationship:** Programmer uses Laptop
        Programmer programmer = new Programmer("Alice", new Laptop("Macbook Pro"));
        programmer.writeCode(); // Outputs "Alice is writing code on her Macbook Pro."
    }
}
