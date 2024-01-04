package doubts;


public class abc {
    public static void main(String[] args) {
        // Creating instances of Animal and Dog
        //Animal genericAnimal = new Animal();
        Dog myDog = new Dog();

        // Upcasting: Assigning a Dog reference to an Animal variable
        Animal animalReference = myDog;

        // Calling the makeSound method on the Animal reference
        // Polymorphism: The Dog's version of makeSound is called
        animalReference.makeSound();

        // Uncommenting the line below would result in a compilation error
        // because the Animal reference cannot access the fetch method
        // animalReference.fetch();

        // Downcasting: Converting the Animal reference back to a Dog reference
        Dog dogReference = (Dog) animalReference;

        // Now, the Dog reference can access both makeSound and fetch methods
        dogReference.makeSound();
        dogReference.fetch();
    }
}