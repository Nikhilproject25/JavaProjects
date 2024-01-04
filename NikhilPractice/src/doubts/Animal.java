// Class representing a generic animal
package doubts;

class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

// Class representing a specific type of animal (Dog) extending Animal
class Dog extends Animal {
//    @Override
//    public void makeSound() {
//        System.out.println("Woof! Woof!");
//    }

    public void fetch() {
        System.out.println("Fetching the ball");
    }
}

