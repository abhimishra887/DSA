// Superclass Animal
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Subclass Cow
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cow moos.");
    }
}

// Main class
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        animal.makeSound(); // Output: The animal makes a sound.
        dog.makeSound();    // Output: The dog barks.
        cat.makeSound();    // Output: The cat meows.
        cow.makeSound();    // Output: The cow moos.
    }
}
