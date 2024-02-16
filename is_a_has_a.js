// "is-a" relationship (Inheritance)
class Vehicle {
    run() {
        console.log("Vehicle is running");
    }
}

class Car extends Vehicle {
    // Car "is-a" Vehicle
}



// "has-a" relationship (Composition)
class Engine {
    start() {
        console.log("Engine is starting");
    }
}

class Car {
    constructor() {
        // Car "has-a" Engine
        this.engine = new Engine();
    }
}




// "uses-a" relationship (Method uses an object of another class)
class Driver {
    drive(car) {
        // Driver "uses-a" Car
        car.run();
    }
}
